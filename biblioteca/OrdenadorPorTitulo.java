package template.biblioteca;

public class OrdenadorPorTitulo extends TemplateOrdenador {

	@Override
	public boolean ordenar(Livros livro1, Livros livro2) {
        if (livro1.titulo.compareToIgnoreCase(livro2.titulo) <= 0) {
            return true;
        }
        return false;
    }
}
