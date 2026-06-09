package br.com.fiap.domain.entity;

import br.com.fiap.domain.valueobject.Destino;
import br.com.fiap.domain.valueobject.Prioridade;
import br.com.fiap.domain.valueobject.StatusCarga;

public class Carga {

    private Long id;
    private String nome;
    private double peso;
    private Prioridade prioridade;
    private Destino destino;
    private StatusCarga status;

    public Carga(Long id,
                 String nome,
                 double peso,
                 Prioridade prioridade,
                 Destino destino) {

        if (peso <= 0) {
            throw new IllegalArgumentException(
                    "O peso deve ser maior que zero."
            );
        }

        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.prioridade = prioridade;
        this.destino = destino;
        this.status = StatusCarga.ARMAZENADA;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Destino getDestino() {
        return destino;
    }

    public StatusCarga getStatus() {
        return status;
    }

    public void enviar() {

        if (status == StatusCarga.ENVIADA) {
            throw new IllegalStateException(
                    "A carga já foi enviada."
            );
        }

        status = StatusCarga.ENVIADA;
    }

    public void receber() {

        if (status != StatusCarga.ENVIADA) {
            throw new IllegalStateException(
                    "A carga ainda não foi enviada."
            );
        }

        status = StatusCarga.RECEBIDA;
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Destino: " + destino);
        System.out.println("Status: " + status);
    }
}