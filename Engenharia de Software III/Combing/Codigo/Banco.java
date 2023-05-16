/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
class Banco {
    private static Banco instance;
    private List<AgenciaBancaria> agencias;

    private Banco() {
        this.agencias = new ArrayList<>();
    }

    public static Banco getInstance() {
        if (instance == null) {
            instance = new Banco();
        }
        return instance;
    }

    public void adicionarAgencia(AgenciaBancaria agencia) {
        agencias.add(agencia);
    }

    public void removerAgencia(AgenciaBancaria agencia) {
        agencias.remove(agencia);
    }

    public void exibirAgencias() {
        for (AgenciaBancaria agencia : agencias) {
            agencia.exibir(0);
        }
    }
}
