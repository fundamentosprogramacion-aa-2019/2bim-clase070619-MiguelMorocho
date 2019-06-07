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
public class EjemploCuatro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String mensajeReporte = "";
        String cadena = "";
        String[] peliculas = {"Comedia", "Terror", "Drama", "Familiar"};
        int[] opcionpelicula = new int[4];
        int seguir = 0;
        int tipo_Peliculas= 0;
        boolean bandera = true;

        while (bandera == true) {
            // Listado de las peliculas a seleccionar 
            System.out.println("\n***Peliculas***\n1) Comedia\n2)"
                    + " Terror\n3) Drama\n4) Familiar ");
                    
            System.out.println("Ingrese el tipo de pelicula que sea de su "
                    + "preferencia:");

            tipo_Peliculas = entrada.nextInt();
            // Opción para salir del ciclo
            System.out.println("Desea seguir el ciclo, ingrese numero 0");
            seguir = entrada.nextInt();

            if (tipo_Peliculas == 1) {
                opcionpelicula[0] = opcionpelicula[0] + 1;

            } else {
                if (tipo_Peliculas == 2) {
                    opcionpelicula[1] = opcionpelicula[1] + 1;
                } else {
                    if (tipo_Peliculas == 3) {
                        opcionpelicula[2] = opcionpelicula[2] + 1;
                    } else {
                        if (tipo_Peliculas == 4) {
                            opcionpelicula[3] = opcionpelicula[3] + 1;
                        }
                    }
                }
            }

            if (seguir == 0) {
                bandera = false;
            }
        }

        mensajeReporte = String.format("%s\n***Reporte de Preferencia de "
                + "Peliculas***\n", mensajeReporte);

        for (int i = 0; i < opcionpelicula.length; i++) {
            int j = opcionpelicula[i];
            String asterisco = "";
            // Ciclo for para cambiar el número por asterisco 
            for (int a = 0; a < j; a++) {
                asterisco = String.format("%s*", asterisco);
            }

            mensajeReporte = String.format("%s %s: %s\n",
                     mensajeReporte, peliculas[i], asterisco);
        }

        System.out.printf("%s\n", mensajeReporte);
    }
}
