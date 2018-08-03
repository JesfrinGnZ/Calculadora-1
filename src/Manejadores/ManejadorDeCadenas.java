/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;

import java.util.ArrayList;

/**
 *
 * @author jesfrin
 */
public class ManejadorDeCadenas {

    //Manejador para separar cadenas donde se incluyen numeros decimales
    public static ArrayList<Double> separarNumerosDecimales(String cadenaDeNumeros, String separador) {
        ArrayList<Double> numerosAOperar = new ArrayList<>();
        System.out.println("cadena:" + cadenaDeNumeros);
        String[] numerosSeparados = cadenaDeNumeros.split(separador);

        for (String numeroIndividual : numerosSeparados) {
            double numeroDescadenado = Double.parseDouble(numeroIndividual);
            numerosAOperar.add(numeroDescadenado);
        }
        return numerosAOperar;
    }

    //Manejador para separar cadenas donde se incluyen numeros eneros
    public static ArrayList<Integer> separarNumerosEnteros(String cadenaDeNumeros, String separador) {
        ArrayList<Integer> numerosAOperar = new ArrayList<>();
        System.out.println("cadena:" + cadenaDeNumeros);
        String[] numerosSeparados = cadenaDeNumeros.split(separador);

        for (String numeroIndividual : numerosSeparados) {
            Integer numeroDescadenado =Integer.parseInt(numeroIndividual);
            numerosAOperar.add(numeroDescadenado);
        }
        return numerosAOperar;
    }
}
