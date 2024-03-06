package org.example.menu;

import org.example.Entidades.Cliente;
import org.example.Entidades.Conta;

import java.util.Scanner;

public class Principal {
    Scanner scanner = new Scanner(System.in);


    public static void acessarConta() {
        System.out.println("Digite seu nome e cpf: ");
        // Coloque aqui a lógica para acessar a conta
    }

    public void menuConta() {
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
                    acessarConta();
                    break;
                case 2:
                    System.out.println("Você escolheu criar conta.");
                    // Coloque aqui a lógica para criar uma nova conta
                    break;
                case 3:
                    System.out.println("Você escolheu remover conta.");
                    // Coloque aqui a lógica para remover uma conta existente
                    break;
                case 0:
                    System.out.println("Saindo do menu. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        scanner.close();
    }

    public void criarNovaConta() {;
        String nome = "";
        String endereco = "";
        int cpf = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o seu nome: ");
        scanner.next(nome);

        System.out.println("Digite o seu endereço");
        scanner.next(endereco);

        System.out.println("Digite seu cpf");
        scanner.nextInt(cpf);

        Cliente novoCliente = new Cliente();
        Conta novaConta = new Conta();

        novoCliente.setNome(nome);
        novoCliente.setEndereço(endereco);
        novoCliente.setCpf(cpf);

    }
}
