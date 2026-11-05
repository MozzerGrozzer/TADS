"""
arquivos em apv/. aparecem no site automaticamente waow

lembrar de executar na raiz do repositório: python3 scripts/autoGrid.py
"""

from html import escape
from pathlib import Path
import re
from urllib.parse import quote

ROOT = Path(__file__).resolve().parent.parent.parent
AUX_DIR = ROOT / "apv"
INDEX_FILE = ROOT / "index.html"
START_MARKER = " <!-- println('hello gostosa') só que em python -->"
END_MARKER = " <!-- adoro gatos -->"

def list_files():
    """Lista recursivamente arquivos visíveis, em ordem estável."""
    return sorted(
        (
            path for path in AUX_DIR.rglob("*")
            if path.is_file()
            and not any(part.startswith(".") for part in path.relative_to(AUX_DIR).parts)
        ),
        key=lambda path: path.relative_to(AUX_DIR).as_posix().casefold(),
    )

def make_cards(files):
    cards = []
    for path in files:
        relative_path = path.relative_to(AUX_DIR).as_posix()
        href = "./apv/" + quote(relative_path, safe="/")
        label = relative_path
        cards.append(
            '            <div id="gridItem">\n'
            f'                <a href="{escape(href, quote=True)}" download>{escape(label)}</a>\n'
            "            </div>"
        )
    return "\n".join(cards)

def grid_opening_tag_end(content):
    opening = re.search(
        r'<div\b[^>]*class\s*=\s*(["\'])[^"\']*\bflexGridGeneral\b[^"\']*\1[^>]*>',
        content,
        flags=re.IGNORECASE,
    )
    if not opening:
        raise ValueError('Não encontrei <div class="flexGridGeneral"> em index.html.')
    return opening.end()


def main():
    if not AUX_DIR.is_dir():
        raise SystemExit(f"Pasta não encontrada: {AUX_DIR}")

    content = INDEX_FILE.read_text(encoding="utf-8")
    has_start = START_MARKER in content
    has_end = END_MARKER in content
    if has_start != has_end:
        raise SystemExit("Marcadores incompletos em index.html; restaure os dois marcadores antes de continuar.")

    files = list_files()
    generated = make_cards(files)
    block = f"{START_MARKER}\n{generated}\n{END_MARKER}" if generated else f"{START_MARKER}\n{END_MARKER}"

    if has_start:
        pattern = re.compile(
            re.escape(START_MARKER) + r".*?" + re.escape(END_MARKER),
            flags=re.DOTALL,
        )
        content, replacements = pattern.subn(lambda _match: block, content, count=1)
        if replacements != 1:
            raise SystemExit("Não foi possível atualizar o bloco automático em index.html.")
    else:
        insertion = grid_opening_tag_end(content)
        content = content[:insertion] + block + "\n" + content[insertion:]

    INDEX_FILE.write_text(content, encoding="utf-8")
    print(f"{len(files)} arquivo(s) listado(s) em index.html.")


if __name__ == "__main__":
    main()