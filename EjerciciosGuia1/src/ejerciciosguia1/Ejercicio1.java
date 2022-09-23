/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma.
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
               int num1;int num2; int suma;
               System.out.println("Este programa suma los dos numeros ingresados por teclado");
               System.out.println("Por favor ingrese un numero");
                   num1 = leer.nextInt();
               System.out.println("Por favor ingrese el segundo numero");
                   num2 = leer.nextInt();
               suma= num1 + num2;
               System.out.println("La suma de los numeros ingresados es:"+suma);
               
    }
}
