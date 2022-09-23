/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        int contador = 3;
       do{
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor introduzca una frase.");
        String frase = leer.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
                    contador=0;}
        else{contador--;
            System.out.println("Incorrecto.Le quedan " +contador+ " intentos.");
                ;}}
       
       while(contador>0);
       }{
        
    }
    
}
