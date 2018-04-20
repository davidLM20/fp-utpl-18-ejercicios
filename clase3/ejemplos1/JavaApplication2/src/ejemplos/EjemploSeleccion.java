/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 /* crear un programa que permita ingresar una calificacion por teclado
    Si la calificacion es mayor o igual 5 y la calificacion es menor a 10
    y presentar un mensaje que diga "Usted esta en supletorios" de lo contrario se presenta un mensaje con el valor de la calificacion dividido para dos 
*/

package ejemplos;

import java.util.Scanner;

/**
 *
 * @author jhand
 */
public class EjemploSeleccion {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int calificacion;
        System.out.println("Ingrese su calificacion");
        calificacion = entrada.nextInt();
        //Python se usa "and" 
        if(calificacion >= 5 && calificacion < 10){
            System.out.printf("Usted esta en supletorios");
            
        }else{
            //System.out.printf("%d", calificacion/2);
            double resultado = calificacion/2;
            System.out.printf("%f", resultado);
             
            
     }
    }
}
