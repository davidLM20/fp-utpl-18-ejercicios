/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author jhand
 */
public class DoWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean salir = true;
        String cadena = "";
        int num_partidos;
        int num_jug;
        double prom_pases;
        double prom_goles;
        String nom_equipo;
        System.out.println("Ingrese el nombre del equipo");
        nom_equipo = entrada.nextLine();
        do {
            String nom_jug;
            int pases;
            int goles;
            int total_pases = 0;
            int total_goles = 0;
            String nivel = " ";
            double todos_pases = 0;
            double todos_goles = 0;
            String cadena_oficial;
            String resultados;
            String cadena_terciaria ;

            String cadena_secundaria = String.format("%s\t%s\t%s\t%s\n", "Nombre del Jugador", "Total de Pases", "Total Goles", "Nivel de Jugador");

            System.out.println("Ingrese el numero de jugadores");
            num_jug = entrada.nextInt();
            System.out.println("Ingrese la cantidad de partidos jugados");
            num_partidos = entrada.nextInt();            
            entrada.nextLine();
            for (int i = 1; i <= num_jug; i++) {
                cadena_terciaria = "";
                System.out.println("Ingrese el nombre y apellido del jugador");
                nom_jug = entrada.nextLine();
                for (int j = 1; j <= num_partidos; j++) {
                  
                    System.out.printf("Ingrese el numero de pases del partido %d\n", j);
                    pases = entrada.nextInt();
                    System.out.printf("Ingrese el numero de goles del partido %d\n", j);
                    goles = entrada.nextInt();
                    
                    total_pases = total_pases + pases;
                    total_goles = total_goles + goles;
                    cadena_terciaria = String.format("%s\t\tP%d: %-10d\tP%d: %d\n\t", cadena_terciaria, j, pases, j, goles);
                    entrada.nextLine();

                }
                todos_goles = todos_goles + total_goles;
                todos_pases = todos_pases + total_pases;

                if (total_pases == 100) {
                    nivel = "Excelente";
                } else if (total_pases >= 80 && total_pases <= 99) {
                    nivel = "Muy Bueno";
                } else if (total_pases >= 60 && total_pases <= 79) {
                    nivel = "Bueno";
                } else if (total_pases >= 0 && total_pases <= 59) {
                    nivel = "Regular";
                }
                cadena_oficial = String.format("%s%s%s\t", cadena_secundaria, nom_jug, cadena_terciaria);
                resultados = String.format("\t\t\tTotal: %d\tTotal: %d\t%s\n", total_pases, total_goles, nivel);
                cadena = String.format("%s\n%s\n%s", cadena, cadena_oficial, resultados);
                total_goles = 0;
                total_pases = 0;
            }
            prom_pases = todos_pases / num_partidos;
            prom_goles = todos_goles / num_partidos;
            salir = false;

        } while (salir);
        System.out.println("  ");
        System.out.printf("Reporte de Jugadores del Equipo \"%s\" ",nom_equipo);
        System.out.println(cadena);
        System.out.println(" ");
        System.out.println("Datos Finales:");
        System.out.printf("%d Jugadores Analizados\n", num_jug);
        
        System.out.printf("Promedio de Pases del equipo es %.2f\n", prom_pases);
        System.out.printf("Promedio de Goles del equipo es %.2f\n", prom_goles);

    }
}
