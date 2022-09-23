/*
  Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase");
        String frase = leer.nextLine();
        String mayus = frase.toUpperCase();
        String min = frase.toLowerCase();
        System.out.println("La frase en mayuscula es: "+mayus);
        System.out.println("La frase en minuscula es: "+min);
    }
    
}
