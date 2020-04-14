package template.biblioteca;

public class OrdenadorPorAutor extends TemplateOrdenador {

	@Override
	public boolean ordenar(Livros livro1, Livros livro2) {
        if (livro1.autor.compareToIgnoreCase(livro2.autor) <= 0) {
            return true;
        }
        return false;
    }

}
