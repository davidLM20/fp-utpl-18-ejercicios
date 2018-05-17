/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author jhand
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double salario;
        int lim1;
        double pasajes;
        int lim2;
        double bar;
        double salidas;
        double sumap;
        double sumab;
        double sumas;
        double total;
        String nombre;
        String padre;
        String conclusion = "";
        String cadena_oficial = "  ";

        System.out.println("Ingrese el numero de familias");
        lim1 = entrada.nextInt();

        for (int i = 1; i <= lim1; i++) {
            String cadena_final = String.format("%s\t%s\t\t%-10s\t%s\n", "Personas", "Pasajes", "Bar", "Salidas");
            entrada.nextLine();
            
            sumap = 0;
            sumab = 0;
            sumas = 0;
            System.out.println("Ingrese el nombre y apellido del padre");
            padre = entrada.nextLine();
            System.out.println("Ingrese el salario del padre");
            salario = entrada.nextDouble();
            System.out.println("Ingrese el numero de hijos");
            lim2 = entrada.nextInt();

            for (int contador = 1; contador <= lim2; contador++) {

                entrada.nextLine();
                System.out.printf("Ingrese el nombre del hijo %d\n ", contador);
                nombre = entrada.nextLine();

                System.out.println("Ingrese la cantidad de dinero para el pasajes");
                pasajes = entrada.nextDouble();
                System.out.println("Ingrese la cantidad de dinero para el bar");
                bar = entrada.nextDouble();
                System.out.println("Ingrese la cantidad de dinero ");
                salidas = entrada.nextDouble();

                sumap = sumap + pasajes;
                sumab = sumab + bar;
                sumas = sumas + salidas;

                cadena_final = String.format("%s%-10s\t%-10.0f\t%-10.0f\t%.0f\n", cadena_final, nombre, pasajes, bar, salidas);

            }
            total = sumap + sumab + sumas;

            if (total < salario) {
                conclusion = "El saldo es suficiente";
            } else if (total > salario) {
                conclusion = "El saldo es insuficiente";
            }
            cadena_oficial = String.format("%sNombre del padre de familia: %s\nSalario del padre: %.2f\nNumero de hijos:"
                    + " %d\n%s\nTotales\t\t%.2f\t\t%.2f\t\t%.2f\nNombre del padre de familia: %s, %s\n\n", cadena_oficial, padre, salario, lim2, cadena_final, sumap, sumab, sumas, padre, conclusion);
            
            entrada.nextLine();

        }
        System.out.println("   ");
        System.out.println("Reporte de Gastos de padres de familia");
        System.out.println("   ");
        System.out.println(cadena_oficial);
    }
}
