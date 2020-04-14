package template.biblioteca;

public class OrdenadorPorAno extends TemplateOrdenador {

	@Override
	public boolean ordenar(Livros livro1, Livros livro2) {
        if (livro1.ano.compareToIgnoreCase(livro2.ano) <= 0) {
            return true;
        }
        return false;
    }

}
