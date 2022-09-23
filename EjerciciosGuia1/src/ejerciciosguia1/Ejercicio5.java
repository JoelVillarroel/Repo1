/*
Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese un numero");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        int doble,triple;
        double raiz;
        doble=num*2;
        triple=num*3;
        raiz=Math.sqrt(num);
        System.out.println("El doble de "+num+" es "+doble);
        System.out.println("El triple de "+num+" es "+triple);
        System.out.println("La raiz de "+num+" es "+raiz);
    }
    
}
