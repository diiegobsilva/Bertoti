/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

/**
 *
 * @author diego
 */
public class NotificacaoSaldo implements Observador {
    private ContaBancaria conta;

    public NotificacaoSaldo(ContaBancaria conta) {
        this.conta = conta;
        conta.adicionarObservador(this);
    }

    @Override
    public void atualizar(double saldo) {
        System.out.println("Saldo atualizado: " + saldo);
    }
}
