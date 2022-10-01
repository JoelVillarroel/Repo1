/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio9extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dividendo=0,divisor=0,resto=0,cociente=0;
        System.out.println("Por favor ingrese el valor del dividendo");
        dividendo = leer.nextInt();
        System.out.println("Introduzca el numero por el que desea dividirlo");
        divisor = leer.nextInt();
        resto=dividendo;
        while (resto>divisor){
            resto=resto-divisor;
            System.out.println(dividendo+"-"+divisor+"="+resto);
        cociente++;
        }
        System.out.println("El residuo final es "+resto+" y el cociente es "+cociente);
    }
    
}
