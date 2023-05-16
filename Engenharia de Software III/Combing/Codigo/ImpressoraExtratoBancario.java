/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combing2;

/**
 *
 * @author diego
 */
class ImpressoraExtratoBancario implements Observador {
    public void atualizar(double saldo) {
        System.out.println("Extrato Bancário: Saldo atual é " + saldo);
    }
}
