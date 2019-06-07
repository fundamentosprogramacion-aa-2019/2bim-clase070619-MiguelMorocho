/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primera_clase_2b;

import java.util.Scanner;

/**
 *
 * @author MIGUEL
 */
public class EjemploTres {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] vocales = {"a", "e", "i", "o", "u"};
        boolean bandera = true;
        int seguir = 0;
        String palabra = "";
        String mensajeReporte = "";
        int[] contador = new int[5];

        while (bandera == true) {

            System.out.println("Ingrese una palabra");
            palabra = entrada.nextLine();

            System.out.println("Desea salir del ciclo, ingrese el número 0");
            seguir = entrada.nextInt();

            char valor = palabra.charAt(0);

            entrada.nextLine(); // para limpiar 

            switch (valor) {
                case 'a':
                case 'A':
                    contador[0] = contador[0] + 1;

                    break;

                case 'e':
                case 'E':
                    contador[1] = contador[1] + 1;

                    break;

                case 'i':
                case 'I':
                    contador[2] = contador[2] + 1;

                    break;

                case 'o':
                case 'O':
                    contador[3] = contador[3] + 1;

                    break;

                case 'u':
                case 'U':
                    contador[4] = contador[4] + 1;

                    break;
            }
            if (seguir == 0) {
                bandera = false;
            }
        }
        for (int i = 0; i < vocales.length; i++) {
            mensajeReporte = String.format("%sVocal:"
                    + " %s -número de veces usada: %d\n",
                     mensajeReporte, vocales[i], contador[i]);
        }
        System.out.printf("%s\n", mensajeReporte);
    }
}
