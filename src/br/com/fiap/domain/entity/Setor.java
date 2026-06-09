package br.com.fiap.domain.entity;

public class Setor {

    private String nome;
    private int capacidade;

    public Setor(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

}