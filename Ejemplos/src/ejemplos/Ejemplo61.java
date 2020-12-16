/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Ejemplo61 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dato;
        // arreglo de tipo entero
        String[] arreglo1 = new String[5]; // se guardara nombres de personas

        // Se asigna valores al arreglo, pidiendo valores por teclado
        // se usa un ciclo repetitivo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Ingrese el nombre");
            dato = entrada.nextLine();
            // se asigna la variable dato a la posición del arreglo
            // de acuerdo al valor de i
            arreglo1[i] = dato;
        }

        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("Subíndice o Índice %d, con nombre %s\n",
                    i, arreglo1[i]);
        }
    }

}
