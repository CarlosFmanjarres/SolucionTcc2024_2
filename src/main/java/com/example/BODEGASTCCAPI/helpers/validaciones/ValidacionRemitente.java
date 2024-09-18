package com.example.BODEGASTCCAPI.helpers.validaciones;

public class ValidacionRemitente {

    public boolean validarNombreRemitente(String nombre){
        if(nombre.length()>50){
            return false;
        }
        return nombre.matches("^[a-zA-Z\\s]+$");
    }

}
