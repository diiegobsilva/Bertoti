/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

/**
 *
 * @author diego
 */
public class Deposito implements OperacaoBancaria {
    private ContaBancaria conta;

    public Deposito(ContaBancaria conta) {
        this.conta = conta;
    }

    @Override
    public void executar(double valor) {
        conta.depositar(valor);
    }
}
