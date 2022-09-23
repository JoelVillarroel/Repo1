/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Por favor introduzca la temperatura a convertir");
        Scanner leer = new Scanner(System.in);
        float c = leer.nextFloat();
        float f = 32 +(9*c/5);
        System.out.println("La temperatura en grados Fahrenheit es:"+f);
    }
    
}
