package com.example.BODEGASTCCAPI.helpers.mensajes;

public enum Mensaje {

    PESO_NEGATIVO("El peso no puede ser negativo"),
    VOLUMEN_NEGATIVO("eL volumen no puede ser negativo"),
    FECHA_INVALIDA("Revisa la fecha ingresada"),
    NOMBRE_INVALIDO("revisa que el nombre sea correcto o que no pase el limite de caracteres")

    ;

    private String mensaje;

    Mensaje() {
    }

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
