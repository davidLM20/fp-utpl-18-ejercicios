/*Ejercicio 2:
Se necesita generar una solución que permita ingresa los datos de varios autos importados,
el número de autos a ingresar se debe solicitar al usuario de manera previa.
Por cada automóvil, se tiene que ingresar: marca, origen y costo. 
Información para los cálculos:
- Se genera un impuesto en función del país de origen, en función del costo del automóvil:
	- Si es Argentina el impuesto es del 20%
	- Si es Colombia el impuesto es del 25%
	- Si es Chile el impuesto es del 30%
	- Cualquier otro país, el impuesto es de 40%
- El precio de venta es igual a la suma del costo del automóvil más el impuesto
- Se debe imprimir el total de autos importados.
- Se debe imprimir  el total de impuestos generados.
- Se debe imprimit el total de los precios de venta de los autos.
- Se debe generar e imprimir el total de autos de los países de origen:
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author jhand
 */
public class EjemploWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int auto;
        String marca;
        String origen;
        double imp;
        double costo;
        int argentina=0;
        int colombia=0;
        int chile=0;
        int otros=0;
        double prec_venta;
        double total_imp=0;
        double total = 0;
        int total_autos=0;
        int cont = 1;
        
                
        String cadena_final = String.format("%s\t\t%s\t\t%s\t\t%s\t%s\n", "Marca", "Origen", "Costo", "Impuesto", "Precio venta");
        
        System.out.println("Ingrese la cantidad total de autos");
        auto = entrada.nextInt();
        
        entrada.nextLine();
        while (cont <= auto){
            System.out.println("Ingrese la marca del vehiculo");
            marca = entrada.nextLine();
            System.out.println("Ingrese el lugar de procedencia del vehiculo");
            origen = entrada.nextLine();
            System.out.println("Ingrese el costo del vehiculo ");
            costo = entrada.nextDouble();
            
             switch (origen) {
                case "Argentina":
                    imp = costo * 0.2;
                    argentina = argentina + 1;
                    break;
                case "Colombia":
                    imp = costo * 0.25;
                    colombia = colombia + 1;
                    break;
                case "Chile":
                    imp = costo * 0.3;
                    chile = chile + 1;
                    break;
                default:
                    imp = costo * 0.4;
                    otros = otros + 1;
                    break;
            }
            
            cont = cont + 1;
            prec_venta = costo + imp;
            total_autos = total_autos + 1;
            total_imp = total_imp + imp;
            total = total + prec_venta;
            cadena_final = String.format("%s%-10s\t%-10s\t%.0f\t\t%.0f\t\t%.0f\n", cadena_final, marca, origen, costo, imp, prec_venta);
            
            entrada.nextLine(); 
            
            
        }
        System.out.println("\tReporte de Autos Importados");
        System.out.println("  ");
        System.out.printf("%s", cadena_final);  
        System.out.printf("Total Autos: %d\t   Tot.  Imp.:  %-10.0f\tTot.  PV:       %-10.0f\n", total_autos, total_imp, total);
        System.out.println("   ");
        System.out.printf("Argentina:\t        %d\n",argentina);
        System.out.printf("chile:\t                %d\n",chile);
        System.out.printf("colombia:\t        %d\n",colombia);
        System.out.printf("Resto de paises:\t%d\n",otros);
    }  

}
