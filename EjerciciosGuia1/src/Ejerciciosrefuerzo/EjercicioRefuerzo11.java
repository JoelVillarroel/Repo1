
package Ejerciciosrefuerzo;
import java.util.Scanner;
public class EjercicioRefuerzo11 {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese una cadena de caracteres que termine en .");
               Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca una frase.");
        String frase;
        frase = leer.nextLine();
        int longitud = frase.length();
        char ultimo = frase.charAt(longitud-1);;
        System.out.println(ultimo);
        int contador=1;
        if (String.valueOf(ultimo).equalsIgnoreCase(".")){
         System.out.println("Genial! Frase ingresada con exito!");
         System.out.println("Cantidad de intentos: "+contador);
        }else{
       do{
           contador++;
           frase=leer.nextLine();
                   longitud = frase.length();
                   ultimo=frase.charAt(longitud-1);;
           System.out.println(ultimo);
       }while (!String.valueOf(ultimo).equalsIgnoreCase(".")); 
         System.out.println("Genial! Frase ingresada con exito!");
         System.out.println("Cantidad de intentos: "+contador);
    
     }
    }
         
    }
