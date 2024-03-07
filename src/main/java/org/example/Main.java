package org.example;

import org.example.Entidades.Cliente;
import org.example.Entidades.Conta;
import org.example.menu.Principal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Principal menuPrincipal = new Principal();
        List<Cliente> listaClientes = new ArrayList<>();

        Conta contaPatrick = new Conta(1234, "Nubank",100.00,"123456");

        Cliente cliente = new Cliente("Patrick", "Vila Nova", 1928374819, contaPatrick);

        listaClientes.add(cliente);

        menuPrincipal.menuConta(listaClientes);
    }
}