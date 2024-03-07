package org.example.menu;

import org.example.entidades.Cliente;
import org.example.entidades.Conta;
import org.example.services.MenuPrincipalService;

import java.util.List;
import java.util.Scanner;

public class Principal {
    Scanner scanner = new Scanner(System.in);

    private final MenuPrincipalService menuPrincipalService = new MenuPrincipalService();



    /* public criarConta(List<Cliente> listaClientes) {

    } */



    public void menuConta(List<Cliente> listaClientes) {
        int opcao;
        do {
            System.out.println("\nMenu do Banco:");
            System.out.println("1 - Acessar conta");
            System.out.println("2 - Criar conta");
            System.out.println("3 - Remover conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                     menuPrincipalService.acessarConta(listaClientes);
                    break;
                case 2:
                    menuPrincipalService.criarNovaConta(listaClientes);
                    break;
                case 3:
                    menuPrincipalService.apagarConta(listaClientes);

                    break;
                case 0:
                    System.out.println("Saindo do menu. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }




}
