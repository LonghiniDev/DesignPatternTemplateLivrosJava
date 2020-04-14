package template.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
    ArrayList<Livros> livro;
    TemplateOrdenador ordenador;
    
    public Biblioteca() {
    	livro = new ArrayList<Livros>();
        
        ordenador = new OrdenadorPorTitulo();

        ordenador = new OrdenadorPorAutor();
        
        ordenador = new OrdenadorPorAno();

        ordenador = new OrdenadorPorGenero();

        ordenador = new OrdenadorPorNumeroPaginas();
        }
	
    public void adicionarLivro(String titulo, String autor, String ano, String genero, String numeroPaginas) {
        livro.add(new Livros(titulo, autor, ano, genero, numeroPaginas));
    }
    
    public void mostrarLivros() {
        ArrayList<Livros> listaLivros = new ArrayList<Livros>();
        listaLivros = ordenador.ordenarLivros(livro);
 
        for (Livros livro : listaLivros) {
            System.out.println(livro.titulo
            				 + livro.autor
                    		 + livro.ano
            				 + livro.genero
            				 + livro.numeroPaginas
            				 );
        }
    }
}
