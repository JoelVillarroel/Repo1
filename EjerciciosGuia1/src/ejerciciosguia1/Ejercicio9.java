/*
Escriba un programa que pida una frase o palabra y valide si la primera 
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de 
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
deberá imprimir “INCORRECTO”.
Nota: investigar la función Substring y equals() de Java.
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese una frase.");
        Scanner leer = new Scanner (System.in);
        String frase,letra;
        frase = leer.nextLine(); 
        letra=frase.substring(0,1);
        if (("a").equals(letra)||("A").equals(letra))
            System.out.println("Correcto"); else {
            System.out.println("Incorrecto");  
        }
    }
    
}
