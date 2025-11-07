package org.main;

import org.model.CalculadoraImpostos;
import org.model.ConversorMoeda;
import org.model.GerenciadorLog;
import org.model.UtilitariosDataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Exercício 1: Conversor de Moedas
        System.out.println("R$100 em dólares: " + ConversorMoeda.realParaDolar(100));
        ConversorMoeda.atualizarTaxas(5.20, 5.60);

        // Exercício 2: Calculadora de Impostos
        double valor = 1000.0;
        System.out.println("IRRF: " + CalculadoraImpostos.calcularIRRF(valor));
        System.out.println("ICMS: " + CalculadoraImpostos.calcularICMS(valor));
        System.out.println("ISS: " + CalculadoraImpostos.calcularISS(valor));

        // Exercício 3: Gerenciador de Logs
        GerenciadorLog.configurarDestino(false); // false = console
        GerenciadorLog.logInfo("Aplicação iniciada.");
        GerenciadorLog.logWarn("Uso de memória acima do esperado.");
        GerenciadorLog.logError("Erro ao conectar ao banco de dados.");

        // Exercício 4: Utilitários de Data e Hora
        LocalDate hoje = LocalDate.now();
        LocalDate futuro = hoje.plusDays(10);
        System.out.println("Data formatada: " + UtilitariosDataHora.formatarData(hoje, "dd/MM/yyyy"));
        System.out.println("Diferença em dias: " + UtilitariosDataHora.diferencaEmDias(hoje, futuro));
        System.out.println("Ano 2024 é bissexto? " + UtilitariosDataHora.isAnoBissexto(2024));
    }
}

