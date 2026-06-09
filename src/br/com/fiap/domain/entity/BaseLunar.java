package br.com.fiap.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class BaseLunar {

    private String nome;
    private List<Setor> setores;

    public BaseLunar(String nome) {
        this.nome = nome;
        this.setores = new ArrayList<>();
    }

    public void adicionarSetor(Setor setor) {
        setores.add(setor);
    }

    public String getNome() {
        return nome;
    }

    public List<Setor> getSetores() {
        return setores;
    }

}