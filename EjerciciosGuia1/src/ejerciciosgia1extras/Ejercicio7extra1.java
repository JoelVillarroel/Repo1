/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio7extra1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("El siguiente programa calculara el numero maximo, el minimo y el promedio de numeros ingresados");
        System.out.println("Por favor ingrese la cantidad de numeros que desea ingresar");
        int n = leer.nextInt(),maximo=0,minimo=2147483647,numero,cont=0,prom=0,cant=n;
        while (cant>0){
            System.out.println("Ingrese el numero "+cant);
            numero=leer.nextInt();
            cant--;
            cont++;
            prom+=numero;
           if (numero>maximo){
              maximo=numero;
           }else if (numero<minimo){
                minimo=numero;
           }
        }
        prom=prom/n;
        System.out.println("El promedio es "+prom);
        System.out.println("El numero maximo es "+maximo);
        System.out.println("El numero minimo es "+minimo);
    }
    
}
