/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

/**
 *
 * @author diego
 */
public class BancoFacade {
    private ContaBancaria conta;
    private NotificacaoSaldo notificacaoSaldo;

    public BancoFacade(String numeroConta, double saldo) {
        conta = new ContaBancaria(numeroConta, saldo);
        notificacaoSaldo = new NotificacaoSaldo(conta);
    }

    public void depositar(double valor) {
        OperacaoBancaria deposito = new Deposito(conta);
        deposito.executar(valor);
    }

    public void sacar(double valor) {
        OperacaoBancaria saque = new Saque(conta);
        saque.executar(valor);
    }
    
    public double visualizarSaldo() {
        return conta.getSaldo();
    }
}
