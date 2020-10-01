package Main;

import Entities.*;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        Editora editora = new Editora(01, "Editora Diego Cravo", "Diego","8199999-9999" );
        Livro livro = new Livro(01, "Design Patterns", "A123", editora);

        System.out.println(livro);

    }

}
