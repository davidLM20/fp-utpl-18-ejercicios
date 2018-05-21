/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaciclofor;

import java.util.Scanner;

/**
 *
 * @author jhand
 */
public class TareaCicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String nom_est;
        int lim1;
        int lim2 = 0;
        int edad;
        String materia;
        double bim1;
        double bim2;
        double prom1;
        double prom2;
        double prom_edad = 0;
        double prom_notas;
        double final_edad = 0;
        double total_prom;
        String conclusion = "";
        double prom_final = 0;
        int cont = 0;
        String cadena_oficial = " ";
        
        System.out.println("Ingrese el numero de estudiantes");
        lim1 = entrada.nextInt();
        for (int i = 1; i <= lim1; i++) {
            String cadena_final = String.format("%s\t%s\t\t%-10s\t%s\n", "Materias", "Bim-1", "Bim-2", "Promedio");
            entrada.nextLine();

            prom2 = 0;
            System.out.printf("Ingrese el nombre del estudiante %d\n", i);
            nom_est = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edad = entrada.nextInt();
            System.out.println("Ingrese el numero de asignaturas");
            lim2 = entrada.nextInt();
            for (int j = 1; j <= lim2; j++) {
                entrada.nextLine();
                System.out.printf("Ingrese la materia %d\n",j);
                materia = entrada.nextLine();
                System.out.println("Ingrese la note del primer bimestre");
                bim1 = entrada.nextDouble();
                System.out.println("Ingrese la nota del segundo bimestre");
                bim2 = entrada.nextDouble();

                prom1 = (bim1 + bim2) / 2;
                prom2 = prom2 + prom1;
                cadena_final = String.format("%s%-10s\t%-10.2f\t%.2f\t\t%.2f\n", cadena_final,materia, bim1, bim2, prom1);
                
            }
            prom_notas = prom2 / lim2;
            
            if(prom_notas >=19){
                conclusion = "Sobresaliente";
            }else if (prom_notas < 19 && prom_notas >= 16){
                conclusion = "Muy bueno";
            }else if (prom_notas < 16 && prom_notas >= 13){
                conclusion = "Bueno";
            }else if (prom_notas < 13){
                conclusion = "Regular";
            }
            cadena_oficial = String.format("%sNombre del estudiante: %s\nEdad: %d\nNúmero de Asignaturas: %d\n\nReportes de notas\n%s\n\t\t\t\tPromedio\t%.2f\n%s, tiene un promedio: %s\n\n",cadena_oficial,nom_est, edad, lim2, cadena_final,prom_notas, nom_est, conclusion );
            prom_edad = prom_edad + edad;
            prom_final = prom_final + prom_notas;
            cont = cont + 1;
            entrada.nextLine();
        }
        final_edad = prom_edad / lim1;
        total_prom = prom_final / lim1;
        
        System.out.println("   ");
        System.out.println("Reporte de calificaciones de estudiantes");
        System.out.println(" ");
        System.out.println(cadena_oficial);
        System.out.println("Informacion global de los estudiantes:");
        System.out.printf("Promedio de edad: %.2f\n", final_edad);
        System.out.printf("Promedio de notas de los estudiantes: %.2f\n", total_prom);
    }

}
