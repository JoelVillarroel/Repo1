/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
    double num,suma=0,num1;
        System.out.println("Por favor ingrese un valor limite positivo.");
        Scanner leer = new Scanner(System.in);
        num = leer.nextDouble();
        do {System.out.println("Introduzca un numero");
                num1=leer.nextDouble();
                suma=suma+num1; 
        }while(suma<num);}}
