/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio11extra {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero entero");
        int numero = leer.nextInt(),cont=0;
        do{
        numero=numero/10;
        cont++;}while (numero>0);
        System.out.println("El numero posee "+cont+" digitos");
    }
    
}
