package com.mycompany.combing2;

/**
 *
 * @author diego
 */
class EstrategiaJurosSimples implements EstrategiaJuros {
    private double taxaJuros;

    public EstrategiaJurosSimples(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double calcularJuros(double saldo) {
        return saldo * taxaJuros;
    }
}
