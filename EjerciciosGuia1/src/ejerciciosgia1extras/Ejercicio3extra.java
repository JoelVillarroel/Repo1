/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio3extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una letra");
        String letra=leer.next();
        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
            System.out.println("Correcto!!! es una vocal!");
        }else if (!letra.equalsIgnoreCase("a")||!letra.equalsIgnoreCase("e")||!letra.equalsIgnoreCase("i")||!letra.equalsIgnoreCase("o")||!letra.equalsIgnoreCase("u"))
        {System.out.println("Incorrecto!El dato ingresado no es una vocal");
        
        }
    }
    
}
