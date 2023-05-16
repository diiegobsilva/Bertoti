    package com.mycompany.combing;


class ImpressoraExtratoBancario implements Observador {
    public void atualizar(Conta conta) {
        System.out.println("Extrato Bancário: Saldo atual é " + conta.getSaldo());
    }
}
