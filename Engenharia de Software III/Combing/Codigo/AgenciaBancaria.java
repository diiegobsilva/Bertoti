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
class AgenciaBancaria extends ComponenteBanco {
    private List<ComponenteBanco> componentes;

    public AgenciaBancaria(String nome) {
        super(nome);
        this.componentes = new ArrayList<>();
    }

    public void adicionar(ComponenteBanco componente) {
        componentes.add(componente);
    }

    public void remover(ComponenteBanco componente) {
        componentes.remove(componente);
    }

    public void exibir(int nivel) {
        System.out.println("-".repeat(nivel) + " " + nome);
        for (ComponenteBanco componente : componentes) {
            componente.exibir(nivel + 1);
        }
    }
}
