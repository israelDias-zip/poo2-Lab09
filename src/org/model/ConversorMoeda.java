package org.model;

public class ConversorMoeda {
    private static double taxaDolar = 5.10; // 1 USD = 5.10 BRL
    private static double taxaEuro = 5.50;  // 1 EUR = 5.50 BRL

    public static double realParaDolar(double valorEmReais) {
        return valorEmReais / taxaDolar;
    }

    public static double dolarParaReal(double valorEmDolares) {
        return valorEmDolares * taxaDolar;
    }

    public static double realParaEuro(double valorEmReais) {
        return valorEmReais / taxaEuro;
    }

    public static double euroParaReal(double valorEmEuros) {
        return valorEmEuros * taxaEuro;
    }

    public static void atualizarTaxas(double novaTaxaDolar, double novaTaxaEuro) {
        taxaDolar = novaTaxaDolar;
        taxaEuro = novaTaxaEuro;
    }
}

