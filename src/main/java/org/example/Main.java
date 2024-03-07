package org.example;

import org.example.entidades.Cliente;
import org.example.entidades.Conta;
import org.example.menu.Principal;
import org.example.services.MenuPrincipalService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MenuPrincipalService menuPrincipalService;

        Principal menuPrincipal = new Principal();

        List<Cliente> listaClientes = new ArrayList<>();

        Conta contaPatrick = new Conta(1234, "Nubank",100.00,"123456");

        Cliente cliente = new Cliente("Patrick", "Vila Nova", 1928374819L, contaPatrick);

        listaClientes.add(cliente);

        menuPrincipal.menuConta(listaClientes);
    }
}