package br.com.alura.screenmatch.config;

public final class Env {

    private Env() {}

    public static String getRequired(String name) {
        String value = System.getenv(name);
        if (value == null || value.isBlank()) {
            throw new IllegalStateException(
                    "Variável de ambiente obrigatória não definida: " + name
            );
        }
        return value;
    }
}
