package Index;

import Entities.Autor;
import Entities.Editora;
import Entities.Livro;

import java.util.Scanner;

public class Cadastrar {

    public static void cadastrarLivro(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Cadastrar Livro:");

        System.out.println("Digite o código do livro");
        int codigo = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite o título do livro");
        String titulo = ler.nextLine();
        System.out.println("Digite o código ISBN do livro");
        String ISBN = ler.nextLine();


        Editora editora = new Editora(01, "Editora Diego Cravo", "Diego","8199999-9999" );

        Livro livro = new Livro(codigo, titulo, ISBN, editora);
        Livro.listaLivro.add(livro);

        Autor autor1 = new Autor(1, "Diego", "12@gmail.com");
        Autor autor2 = new Autor(2, "Rodrigues", "12@gmail.com");
        Autor autor3 = new Autor(3, "Cravo", "12@gmail.com");

        String nomes[] = {autor1.getNome(), autor2.getNome(), autor3.getNome()};



        System.out.println(livro + ", Autores: " + nomes[0] + ", " + nomes[1] + ", " + nomes[2]);

    }
}
