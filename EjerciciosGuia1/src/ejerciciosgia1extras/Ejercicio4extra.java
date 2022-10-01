/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio4extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero entre el 1 y el 10");
        int num = leer.nextInt();
        while (num<1 || num >10){
            System.out.println("Incorrecto!Intente nuevamente");
            num=leer.nextInt();
        }
                switch (num){
            case 1: System.out.println("El equivalente de "+num+" en numeros romanos es I");
            break;
            case 2: System.out.println("El equivalente de "+num+" en numeros romanos es II");
            break;
            case 3: System.out.println("El equivalente de "+num+" en numeros romanos es III");
            break;
            case 4: System.out.println("El equivalente de "+num+" en numeros romanos es IV");
            break;
            case 5: System.out.println("El equivalente de "+num+" en numeros romanos es V");
            break;
            case 6: System.out.println("El equivalente de "+num+" en numeros romanos es VI");
            break;
            case 7: System.out.println("El equivalente de "+num+" en numeros romanos es VII");
            break;
            case 8: System.out.println("El equivalente de "+num+" en numeros romanos es VIII");
            break;
            case 9: System.out.println("El equivalente de "+num+" en numeros romanos es IX");
            break;
            case 10: System.out.println("El equivalente de "+num+" en numeros romanos es X");
            break;
                }
    }
    
}
