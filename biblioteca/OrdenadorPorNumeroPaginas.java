package template.biblioteca;

public class OrdenadorPorNumeroPaginas extends TemplateOrdenador {

	@Override
	public boolean ordenar(Livros livro1, Livros livro2) {
        if (livro1.numeroPaginas.compareToIgnoreCase(livro2.numeroPaginas) <= 0) {
            return true;
        }
        return false;
    }

}
