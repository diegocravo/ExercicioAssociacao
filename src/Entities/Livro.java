package Entities;

import Index.Cadastrar;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private int codigo;
    private String titulo;
    private String ISBN;
    private Editora editora;

    public static List<Livro> listaLivro = new ArrayList<Livro>();

    public Livro (int codigo, String titulo, String ISBN, Editora editora){
        this.codigo = codigo;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro: \n"
                + "Código: "
                + codigo
                + ", Título: "
                + titulo
                + ", ISBN: "
                + ISBN
                + ", Editora: "
                + editora.getRazaoSocial();
    }
}
