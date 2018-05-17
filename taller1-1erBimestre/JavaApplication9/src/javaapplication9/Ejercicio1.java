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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double salario;
        int lim;
        double pasajes;
        double bar;
        double salidas;
        double sumap=0;
        double sumab = 0;
        double sumas = 0;
        double total =0 ;
        String nombre ;
        String cadena_final = String.format("%s\t%s\t\t%-10s\t%s\n", "Personas", "Pasajes", "Bar", "Salidas");
        
        System.out.println("Ingrese el salario del padre de familia");
        salario = entrada.nextDouble();
        System.out.println("Ingrese el numero de hijos");
        lim = entrada.nextInt();
        
        
        entrada.nextLine();
        for (int contador = 1; contador <= lim; contador++){
            System.out.printf("Ingrese el nombre del hijo %d\n ",contador);
            nombre = entrada.nextLine();
            System.out.println("Ingrese la cantidad de dinero para el pasajes");
            pasajes = entrada.nextDouble();
            System.out.println("Ingrese la cantidad de dinero para el bar");
            bar = entrada.nextDouble();
            System.out.println("Ingrese la cantidad de dinero");
            salidas = entrada.nextDouble();
            
            sumap = sumap + pasajes;
            sumab = sumab + bar;
            sumas = sumas + salidas;
            
            cadena_final = String.format("%s%-10s\t%-10.0f\t%-10.0f\t%.0f\n", cadena_final, nombre, pasajes , bar, salidas);
            
            total= sumap + sumab + sumas;
            entrada.nextLine();
            

        
    }
        System.out.println("\tGastos Familiares\n");
        System.out.printf("%s", cadena_final);
        System.out.printf("Totales\t\t%-10.0f\t%-10.0f\t%.0f\n",sumap,sumab,sumas);
        if (total < salario){
           System.out.println("El saldo es suficientes\n");
        }else{
        System.out.println("El saldo es insuficiente\n");
        }
  }
    
}
