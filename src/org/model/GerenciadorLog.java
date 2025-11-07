package org.model;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerenciadorLog {
    private static boolean logEmArquivo = false;
    private static final String CAMINHO_ARQUIVO = "logs.txt";

    public static void configurarDestino(boolean usarArquivo) {
        logEmArquivo = usarArquivo;
    }

    private static void escreverLog(String nivel, String mensagem) {
        String logFormatado = String.format("[%s] [%s] %s",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                nivel, mensagem);

        if (logEmArquivo) {
            try (FileWriter writer = new FileWriter(CAMINHO_ARQUIVO, true)) {
                writer.write(logFormatado + "\n");
            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
            }
        } else {
            System.out.println(logFormatado);
        }
    }

    public static void logInfo(String mensagem) {
        escreverLog("INFO", mensagem);
    }

    public static void logWarn(String mensagem) {
        escreverLog("WARN", mensagem);
    }

    public static void logError(String mensagem) {
        escreverLog("ERROR", mensagem);
    }
}

