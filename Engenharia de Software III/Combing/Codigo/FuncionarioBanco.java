/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combing;

/**
 *
 * @author diego
 */
class FuncionarioBanco extends ComponenteBanco {
    public FuncionarioBanco(String nome) {
        super(nome);
    }

    public void adicionar(ComponenteBanco componente) {
        // Não aplicável para FuncionarioBanco
    }

    public void remover(ComponenteBanco componente) {
        // Não aplicável para FuncionarioBanco
    }

    public void exibir(int nivel) {
        System.out.println("-".repeat(nivel) + " " + nome);
    }
}
