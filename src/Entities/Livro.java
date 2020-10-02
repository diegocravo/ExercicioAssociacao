package Entities;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private int codigo;
    private String titulo;
    private String ISBN;
    private Editora editora;
    private static List<Autor> autores = new ArrayList<>();

    public static List<Livro> listaLivro = new ArrayList<Livro>();

    public Livro (int codigo, String titulo, String ISBN, Editora editora){
        this.codigo = codigo;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.editora = editora;
    }

    public static void adicionarAutores(Autor autor){
        autores.add(autor);
    }

    public String returnAutores() {
        String resultadoAutores = "";
        for (int x = 0; x < autores.size(); x++){
            resultadoAutores += ("\n" + autores.get(x).getNome());
        }
        return resultadoAutores;
    }

    @Override
    public String toString() {
        return "Detalhes Livro:"
                + "\nTítulo: "
                + titulo
                + "\nCódigo: "
                + codigo
                + "\nISBN: "
                + ISBN
                + "\nEditora: "
                + editora.getRazaoSocial()
                + "\nAutores: "
                + returnAutores()
                + "\n";
    }
}
