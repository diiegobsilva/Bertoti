/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

/**
 *
 * @author diego
 */
import java.util.Scanner;

public class View implements Observador{
    private ContaBancaria conta;
    private BancoFacade banco;
    private Scanner scanner;
    
    public View(ContaBancaria conta) {
        this.conta = conta;
        conta.adicionarObservador(this);
    }

    @Override
    public void atualizar(double saldo) {
        System.out.println("Saldo atualizado: " + saldo);
    }

    
    
    public View() {
        banco = new BancoFacade("123456", 1000.0);
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Visualizar Saldo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarDeposito();
                    break;
                case 2:
                    realizarSaque();
                    break;
                case 3:
                    visualizarSaldo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private void realizarDeposito() {
        System.out.print("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();
        banco.depositar(valor);
    }

    private void realizarSaque() {
        System.out.print("Digite o valor a ser sacado: ");
        double valor = scanner.nextDouble();
        banco.sacar(valor);
    }

    private void visualizarSaldo() {
        double saldo = banco.visualizarSaldo();
        System.out.println("Saldo atual: " + saldo);
    }
}
