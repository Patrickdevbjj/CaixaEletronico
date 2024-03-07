package org.example.menu;

import org.example.Entidades.Cliente;
import org.example.Entidades.Conta;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Principal {
    Scanner scanner = new Scanner(System.in);


    public criarConta(List<Cliente> listaClientes) {
        
    }

    public void acessarConta(List<Cliente> listaClientes) {

        System.out.println("Digite seu CPF: ");
        int cpf = scanner.nextInt();

        System.out.println("Digite sua Senha: ");
        String senha = scanner.next();

        List<Cliente> clientePermitido = listaClientes.stream().filter((cliente) -> {
            return cliente.getCpf() == cpf && cliente.getContaCliente().getSenha() == senha;
        }).toList();

        if (!clientePermitido.isEmpty()) {
            System.out.println(clientePermitido.get(0));
        } else {
            System.out.println("Usuario não encontrado ");
        }
    }

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
                    acessarConta(listaClientes);
                    break;
                case 2:
                    System.out.println("Você escolheu criar conta.");

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
    }


    public void criarNovaConta() {
        String nome = "";
        String endereco = "";
        int cpf = 0;


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
