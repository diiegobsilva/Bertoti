package com.mycompany.combing;

public class Main {
    public static void main(String[] args) {
        // Criação das estratégias de juros
        EstrategiaJuros jurosSimples = new EstrategiaJurosSimples(0.05);
        EstrategiaJuros jurosCompostos = new EstrategiaJurosCompostos(0.1, 12);

        // Criação da conta e associação com os observadores
        Conta conta = new Conta();
        Observador impressoraExtrato = new ImpressoraExtratoBancario();
        conta.adicionarObservador(impressoraExtrato);

        // Realização de operações na conta
        conta.depositar(3500);
        conta.sacar(500);

        // Criação da agência bancária e adição de funcionários
        AgenciaBancaria agencia = new AgenciaBancaria("Agência Principal");
        ComponenteBanco funcionario1 = new FuncionarioBanco("Diego");
        ComponenteBanco funcionario2 = new FuncionarioBanco("Danilo");
        agencia.adicionar(funcionario1);
        agencia.adicionar(funcionario2);

        // Criação do singleton do banco e adição da agência
        Banco banco = Banco.getInstance();
        banco.adicionarAgencia(agencia);

        // Exibição das agências do banco
        banco.exibirAgencias();
    }
}