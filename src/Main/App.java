package Main;

import java.util.Locale;
import java.util.Scanner;

import Entities.*;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Editora editora = new Editora(01, "Editora Diego Cravo", "Diego","8199999-9999" );
        Livro livro = new Livro(01, "Design Patterns", "A123", editora);

        System.out.println(livro);

    }

}
