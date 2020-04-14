package template.biblioteca;

import java.util.ArrayList;

public abstract class TemplateOrdenador {
	 
	public abstract boolean ordenar(Livros livro1, Livros livro2);
	 
    public ArrayList<Livros> ordenarLivros(ArrayList<Livros> lista) {
        ArrayList<Livros> novaLista = new ArrayList<Livros>();
        for (Livros livro : lista) {
            novaLista.add(livro);
        }
 
        for (int i = 0; i < novaLista.size(); i++) {
            for (int j = i; j < novaLista.size(); j++) {
                if (!ordenar(novaLista.get(i), novaLista.get(j))) {
                	Livros temp = novaLista.get(j);
                    novaLista.set(j, novaLista.get(i));
                    novaLista.set(i, temp);
                }
            }
        }
 
        return novaLista;
    }

}
