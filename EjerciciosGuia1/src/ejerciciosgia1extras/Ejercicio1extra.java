/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio1extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de minutos a convertir");
        double minutos=leer.nextInt();
        double dias=1440;double horas=60;
        dias=minutos/dias;
        horas=(minutos%1440)/60;
        double decimald=dias%1; double enterod =dias - decimald;
        double decimalh=horas%1;double enteroh=horas-decimalh;
        
        {System.out.println(enterod+" dia/s, "+enteroh+" hora/s, ");}
    }
}
