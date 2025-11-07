package org.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class UtilitariosDataHora {

    public static String formatarData(LocalDate data, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        return data.format(formatter);
    }

    public static long diferencaEmDias(LocalDate dataInicial, LocalDate dataFinal) {
        return ChronoUnit.DAYS.between(dataInicial, dataFinal);
    }

    public static boolean isAnoBissexto(int ano) {
        return LocalDate.of(ano, 1, 1).isLeapYear();
    }
}

