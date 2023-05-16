/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combing2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
class ContaBancaria {
    private double saldo;
    private List<Observador> observadores;

    public ContaBancaria() {
        this.saldo = 0;
        this.observadores = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        notificarObservadores();
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            notificarObservadores();
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(saldo);
        }
    }
}
