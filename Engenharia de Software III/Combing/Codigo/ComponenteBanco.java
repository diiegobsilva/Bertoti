package com.mycompany.combing;
/**
 *
 * @author diego
 */
abstract class ComponenteBanco {
    protected String nome;

    public ComponenteBanco(String nome) {
        this.nome = nome;
    }

    public abstract void adicionar(ComponenteBanco componente);

    public abstract void remover(ComponenteBanco componente);

    public abstract void exibir(int nivel);
}
