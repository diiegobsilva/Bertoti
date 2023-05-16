 package com.mycompany.combing2;
/**
 *
 * @author diego
 */
class EstrategiaJurosCompostos implements EstrategiaJuros {
    private double taxaJuros;
    private int periodos;

    public EstrategiaJurosCompostos(double taxaJuros, int periodos) {
        this.taxaJuros = taxaJuros;
        this.periodos = periodos;
    }

    public double calcularJuros(double saldo) {
        return saldo * Math.pow(1 + taxaJuros, periodos) - saldo;
    }
}
