/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private List<Observador> observadores;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.observadores = new ArrayList<>();
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Novo saldo: " + saldo);
        notificarObservadores();
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
            notificarObservadores();
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(saldo);
        }
    }
}
