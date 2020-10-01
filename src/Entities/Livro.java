package Entities;

public class Livro {

    private int codigo;
    private String titulo;
    private String ISBN;
    private Editora editora;

    public Livro (int codigo, String titulo, String ISBN, Editora editora){
        this.codigo = codigo;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro:"
                + "codigo: "
                + codigo
                + ", titulo: "
                + titulo
                + ", ISBN: "
                + ISBN
                + ", editora: "
                + editora.getRazaoSocial()
                + '\n';
    }
}
