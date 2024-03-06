package org.example;

import org.example.Entidades.Cliente;
import org.example.Entidades.Conta;

public class Main {
    public static void main(String[] args) {

        Conta contaPatrick = new Conta(1234, "Nubank",100.00,"123456");

        Cliente cliente = new Cliente("Patrick", "Vila Nova", 1928374819, contaPatrick);


    }
}