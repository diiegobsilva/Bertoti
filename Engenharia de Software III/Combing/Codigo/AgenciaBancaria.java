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
class AgenciaBancaria {
    private String nome;
    private List<AgenciaBancaria> agencias;
    private List<String> funcionarios;

    public AgenciaBancaria(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarAgencia(AgenciaBancaria agencia) {
        agencias.add(agencia);
    }

    public void removerAgencia(AgenciaBancaria agencia) {
        agencias.remove(agencia);
    }

    public void adicionarFuncionario(String funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String funcionario) {
        funcionarios.remove(funcionario);
    }

    public void exibir() {
        System.out.println("Agência: " + nome);
        for (AgenciaBancaria agencia : agencias) {
            agencia.exibir();
        }
        for (String funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario);
        }
    }
}
