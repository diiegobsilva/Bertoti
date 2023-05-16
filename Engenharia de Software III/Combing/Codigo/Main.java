/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.combing2;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        // Criação das estratégias de juros
        EstrategiaJuros jurosSimples = new EstrategiaJurosSimples(0.05);
        EstrategiaJuros jurosCompostos = new EstrategiaJurosCompostos(0.1, 12);

        // Criação da conta e associação com os observadores
        ContaBancaria conta = new ContaBancaria();
        Observador impressoraExtrato = new ImpressoraExtratoBancario();
        conta.adicionarObservador(impressoraExtrato);

        // Realização de operações na conta
        conta.depositar(3500);
        conta.sacar(500);

        // Criação da agência bancária e adição de funcionários
        AgenciaBancaria agencia = new AgenciaBancaria("Agência Principal");
        agencia.adicionarFuncionario("Diego");
        agencia.adicionarFuncionario("Danilo");

        // Criação do singleton do banco e adição da agência
        Banco banco = Banco.getInstance();
        banco.adicionarAgencia(agencia);

        // Exibição das agências do banco
        banco.exibirAgencias();
    }
}
