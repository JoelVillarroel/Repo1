/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio14extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor introduzca la cantidad de familias");
        int familias=leer.nextInt(),edad=0,edades=0,cont=0,prom=0;
        for (int i = 1; i < familias+1; i++) {
            System.out.println("Introduzca la cantidad de hijos de la familia "+i);
            int hijos = leer.nextInt();  
            for (int j = 1; j < hijos+1; j++) {
                edades+=edad;
                cont++;
                System.out.println("Introduzca la edad del hijo "+j);
                edad = leer.nextInt();
            }
        }
        prom=edades/cont;
        System.out.println("El promedio de edad de los hijos de todas las familias es "+prom);
        
    }
    
}
