package com.ps.registro.utilidades;


import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@UtilityClass
public class utilitis {


    public String selectionDay(int day) {
/*
        var result = switch(day) {
            case 1 -> "Lunes";
            case 2 -> "martes";
            case 3 -> "miercoles";
            default -> 0;
        };
  */
        String resultado = null;

        switch (day) {
            case 1:
                resultado = "lunes";
                break;
            case 2:
                resultado = "martes";
                break;
            case 3:
                resultado = "miercoles";
                break;
            case 4:
                resultado = "jueves";
                break;
            case 5:
                resultado = "viernes";
                break;
            case 6:
                resultado = "sabado";
                break;
            case 7:
                resultado = "domingo";
                break;
        }

        return resultado;
    }



    public static double contarEdadTrabajadores(List<Integer> edadesDetrabajadores) {
        double resultado = 0;

        for (int i = 0; i < edadesDetrabajadores.size(); i++) {
            resultado = resultado + edadesDetrabajadores.get(i);
        }

        return resultado / edadesDetrabajadores.size();
    }



    public static void main(String[] args) {
        //--> Bucle while
        int i = 15; //iterador

        while (i < 10) {
            System.out.println("El valor es: " + i);
            i++; //incremento
        }

    }


}