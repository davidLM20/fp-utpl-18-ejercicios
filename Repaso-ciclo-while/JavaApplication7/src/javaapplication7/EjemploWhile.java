/*Elaborar un programa en lenguaje Java, que permita ingresar los valores de productos vendidos a un clinte, en un supermecado.
Los productos serán ingresados, hasta que el usuario lo decida.
Ejemplificar con los siguiente datos:
Información que necesita ingresar durante la ejecución del programa:
- Ingresar el nombre del cliente.
- Para cada artículo se debe ingresar:
	- Nombre del artículo.
	- Cantidad de artículos.
	- Precio unitario de cada artículo.
- Se debe generar el siguiente reporte
img
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author jhand
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String cliente;
        String articulo;
        int cant;
        double preciart;
        double subtotal = 0;
        double iva;
        double prectotal;
        double total;
        boolean salir = true;
        String cadena_final;

        cadena_final = String.format("%s\t%s\t%s\t\t%s\n", "Articulo", "Cantidad", "Precio unitario", "Precio total");
        System.out.println("Ingrese el nombre y apellido del cliente");
        cliente = entrada.nextLine();
        while (salir) {
            System.out.println("Ingrese el nombre del Artículo");
            articulo = entrada.nextLine();
            System.out.println("Ingrese la cantidad de las unidades a comprar del articulo");
            cant = entrada.nextInt();
            System.out.println("Ingrese el precio unitario de cada articulo");
            preciart = entrada.nextDouble();

            
            prectotal = preciart * cant;
            subtotal = prectotal + subtotal; 
            cadena_final=String.format("%s%-10s\t%-10d\t%-10.2f\t\t%-10.2f\n",cadena_final,articulo,cant,preciart,prectotal);
            entrada.nextLine();
            System.out.println("Ingrese si(salir), no(continuar)");
            String temporal = entrada.nextLine();
            if (temporal.equals("si")) {
                salir = false;
               
            }

        }
        iva = subtotal * 0.14;
        total = subtotal + iva;
        System.out.println("                      Factura");
        System.out.println("   ");
        System.out.println("Super Mercado \"Todo a menor precio\" ");
        System.out.printf("Nombre del ciente: %s\n",cliente);
        System.out.println("   ");
        System.out.printf("%s", cadena_final);
        System.out.printf("\t\t                sub total\t        %.2f\n",subtotal);
        System.out.printf("\t\t                Iva 14%% \t         %.2f\n",iva);
        System.out.printf("\t\t                Total\t                %.2f\n",total);
    }  

}
