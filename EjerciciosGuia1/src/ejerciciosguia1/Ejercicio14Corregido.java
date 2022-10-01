/*
 
 */
package ejerciciosguia1;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio14Corregido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     String moneda;
        System.out.println("¿Cuantos euros desea convertir?");
        double euro = leer.nextDouble();
        boolean flag = true;
         System.out.println("A que tipo de moneda desea converirlo");
          moneda = leer.next();
        do { 
        if (!moneda.equalsIgnoreCase("libras")|| (!moneda.equalsIgnoreCase("yenes"))||(!moneda.equalsIgnoreCase("dolares"))){
            System.out.println("Incorrecto");
            flag = false;
            moneda=leer.next();
        } if ((moneda.equalsIgnoreCase("libras"))||(moneda.equalsIgnoreCase("yenes"))||(moneda.equalsIgnoreCase("dolares"))){
         flag = true;
        cambio(euro, moneda);}
        }while (flag == false);
    }
    public static void cambio(double euro,String moneda){
         if ( moneda.equalsIgnoreCase("libras")){
             System.out.println("Pasado a libras es: " + (0.86 * euro));
             
         }else if ( moneda.equalsIgnoreCase("dolares")){
             System.out.println("Pasado a dolares es: " + (1.28611 * euro));
             
         } else if ( moneda.equalsIgnoreCase("yenes")){
             System.out.println("Pasado a yenes es: " + (129.852*euro));
             
                 
         }

}}
