/*
Realizar un algoritmo que rellene un vector de tamaño N con valores 
aleatorios y le pida al usuario un numero a buscar en el vector. El 
programa mostrará donde se encuentra el numero y si se encuentra repetido
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el tamaño del vector");
        int tamaño=leer.nextInt();int []vector = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            vector[i]=(int)(Math.random()*10);
            
        }
        System.out.println("El vector generado es el siguiente:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(vector[i]+" ");
        }
    }
    
}
