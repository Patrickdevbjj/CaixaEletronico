package org.example.menu;

import java.util.Scanner;

public class MinhaConta {


        public static void menuContaPrincipal() {
            Scanner scanner = new Scanner(System.in);
            int opcao;

            System.out.println("Bem-vindo ao sistema bancário!");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Ver informações do cliente");
            System.out.println("5 - Alterar senha");
            System.out.println("6 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção selecionada: Ver saldo");
                    // Lógica para exibir o saldo
                    break;
                case 2:
                    System.out.println("Opção selecionada: Sacar");
                    // Lógica para realizar saque
                    break;
                case 3:
                    System.out.println("Opção selecionada: Depositar");
                    // Lógica para realizar depósito
                    break;
                case 4:
                    System.out.println("Opção selecionada: Ver informações do cliente");
                    // Lógica para exibir informações do cliente
                    break;
                case 5:
                    System.out.println("Opção selecionada: Alterar senha");
                    // Lógica para alterar a senha
                    break;
                case 6:
                    System.out.println("Opção selecionada: Sair");
                    // Lógica para encerrar o programa
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }




