package Entities;

public class Editora {

    private int codigo;
    private String razaoSocial;
    private String contato;
    private String telefone;

    public Editora (int codigo, String razaoSocial, String contato, String telefone){
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.contato = contato;
        this.telefone = telefone;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    @Override
    public String toString() {
        return "Editora: \n"
                + "codigo: "
                + codigo
                + ", Razão Social: "
                + razaoSocial
                + ", Contato: "
                + contato
                + ", Telefone: "
                + telefone
                + "\n";
    }
}
