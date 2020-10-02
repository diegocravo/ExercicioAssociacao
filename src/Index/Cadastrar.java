package Index;

import Entities.Autor;
import Entities.Editora;
import Entities.Livro;

import java.util.Scanner;

public class Cadastrar {

    public static void cadastrarLivro(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Cadastrar Livro:");

        int codigo = 0;
        do{
            try {
                System.out.println("Digite o código do livro");
                codigo = ler.nextInt();
                ler.nextLine();
            }catch (Exception e){
                System.out.println("Entrada deve ser numérica");
                ler.next();
            }
        }while (codigo == 0);

        System.out.println("Digite o título do livro");
        String titulo = ler.nextLine();
        System.out.println("Digite o código ISBN do livro");
        String ISBN = ler.nextLine();

        Livro.adicionarAutores(new Autor(1, "Joey Tribbiani", "123@gmail.com"));
        Livro.adicionarAutores(new Autor(2, "Sheldon Coopen", "1212@gmail.com"));
        Livro.adicionarAutores(new Autor(3, "Phoebe Buffay", "1asdadsa2@gmail.com"));

        Editora editora = new Editora(01, "Editora Diego Cravo", "Diego","8199999-9999");

        Livro livro = new Livro(codigo, titulo, ISBN, editora);
        Livro.listaLivro.add(livro);

        System.out.println(livro);

    }
}
