/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio13extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor indique la altura de la escalera");
        int altura=leer.nextInt();
        System.out.println("===================");
        for (int i = 0; i < altura; i++) {
            for (int j = 1; j<i+2; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
}
