package org.example.Entidades;

public class Cliente {

    private String nome;
    private String endereço;
    private int cpf;

    Conta contaCliente = new Conta();
    public Cliente() {
    }

    public Cliente(String nome, String endereço, int cpf, Conta contaCliente) {
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.contaCliente = contaCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Conta getContaCliente() {
        return contaCliente;
    }

    public void setContaCliente(Conta contaCliente) {
        this.contaCliente = contaCliente;
    }
}
