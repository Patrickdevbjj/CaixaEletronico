package org.example.Entidades;

public class Conta {

    private int contaCorrente;
    private int agencia;
    private String Banco;
    private Double saldo;
    private String senha;


    public Conta() {
    }

    public Conta(int contaCorrente, int agencia,String qualBanco, Double saldo, String senha ) {
        this.contaCorrente = contaCorrente;
        this.agencia = agencia;
        this.Banco = qualBanco;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(int contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
