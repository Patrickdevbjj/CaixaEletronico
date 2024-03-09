package org.example.services;

import org.example.entidades.Cliente;
import org.example.entidades.Conta;
import org.example.menu.MinhaConta;

import java.util.List;
import java.util.Scanner;

public class MenuPrincipalService {
    Scanner scanner = new Scanner(System.in);

    public MinhaConta minhaConta = new MinhaConta();

     public boolean verificarSenha(List<Cliente> listaClientes) {
        System.out.println("Digite seu CPF: ");
        int cpf = scanner.nextInt();

        System.out.println("Digite sua Senha: ");
        String senha = scanner.next();

        List<Cliente> clientePermitido = listaClientes.stream().filter((cliente) -> {
            return cliente.getCpf() == cpf && cliente.getContaCliente().getSenha().equals(senha);
        }).toList();

        if (!clientePermitido.isEmpty()) {
            System.out.println(clientePermitido.get(0));
            System.out.println("Login bem-sucedido!");
            return true;
        } else {
            System.out.println("Usuário não encontrado ou senha incorreta.");
            return false;
        }
    }

    public void acessarConta(List<Cliente> listaClientes) {

        verificarSenha(listaClientes);

        MinhaConta.menuContaPrincipal();
    }

    public void criarNovaConta(List<Cliente> listaClientes) {
        System.out.println("Você escolheu criar conta.");

        String nome = "";
        String endereco = "";
        long cpf = 0L;
        String senha = "";

        System.out.println("Digite o seu nome: ");
        nome = scanner.next();

        System.out.println("Digite o seu endereço: ");
        endereco = scanner.next();

        System.out.println("Digite seu cpf: ");
        cpf = scanner.nextLong();

        System.out.println("Escolha a sua senha: ");
        senha = scanner.next();

        Cliente novoCliente = new Cliente();
        Conta novaConta = new Conta();

        novoCliente.setNome(nome);
        novoCliente.setEndereço(endereco);
        novoCliente.setCpf(cpf);
        novaConta.setSenha(senha);

        listaClientes.add(novoCliente);
        System.out.println(novoCliente);
        System.out.println(listaClientes);

        System.out.println("Cliente cadastrado com sucesso! ");
    }

    public void mostrarClientes(List<Cliente> listaClientes) {
        for (Cliente cliente : listaClientes) {
            System.out.println("Nome do cliente: " + cliente.getNome());

        }
    }
    public void apagarConta(List<Cliente> listaClientes) {
        System.out.print("Digite a posição do cliente a ser excluído (0 a " + (listaClientes.size() - 1) + "): ");
        int posicao = scanner.nextInt();

        if (posicao >= 0 && posicao < listaClientes.size()) {
            if (verificarSenha(listaClientes)) {
                listaClientes.remove(posicao);
                System.out.println("Cliente removido com sucesso!");
            } else {
                System.out.println("Senha inválida. Certifique-se de digitar a senha correta.");
            }
        } else {
            System.out.println("Posição inválida. Certifique-se de escolher uma posição válida.");
        }




    }
}
