package Entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Autor {

    private int id;
    private String nome;
    private String email;

    public Autor(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
}

