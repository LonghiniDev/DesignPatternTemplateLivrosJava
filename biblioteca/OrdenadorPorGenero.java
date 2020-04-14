package template.biblioteca;

public class OrdenadorPorGenero extends TemplateOrdenador {

	@Override
	public boolean ordenar(Livros livro1, Livros livro2) {
        if (livro1.genero.compareToIgnoreCase(livro2.genero) <= 0) {
            return true;
        }
        return false;
    }

}

