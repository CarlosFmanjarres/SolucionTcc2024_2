package com.example.BODEGASTCCAPI.helpers.mensajes;

public enum Mensaje {

    PESO_NEGATIVO("El peso no puede ser negativo"),

    VOLUMEN_NEGATIVO("El volumen no puede ser negativo"),

    FECHA_INVALIDA("Revisa la fecha ingresada"),

    DEPARTAMENTO_INVALIDO("este departamento no existe"),

    METODO_PAGO_INVALIDO("solo manejamos bamcolombia o nequi"),

    NOMBRE_INVALIDO("este nombre no es valido")








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
