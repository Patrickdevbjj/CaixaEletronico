package org.example.Entidades;

import java.util.Scanner;

public class Conta {


    private int agencia;
    private String Banco;
    private Double saldo;
    private String senha;


    public Conta() {
    }

    public Conta( int agencia,String qualBanco, Double saldo, String senha ) {
        this.agencia = agencia;
        this.Banco = qualBanco;
        this.saldo = saldo;
        this.senha = senha;
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

    public criarNovaConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome :");
        scanner.next(nome);
    }
}
