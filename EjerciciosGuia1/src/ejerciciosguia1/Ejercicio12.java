/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y 
toda secuencia distinta de FDE, que no respete el formato se considera 
incorrecta. Al finalizar el proceso, se imprime un informe indicando la 
cantidad de lecturas correctas e incorrectas recibidas. Para resolver el 
ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una cadena");
         String cadena;
        int lecin = 0,lecco=0;
      do {
          cadena=leer.next();
          int longitud=cadena.length();
      if (longitud!=5){System.out.println("Solo leeremos 5 caracteres!");
      lecin++;
      }
      else if (cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")){
      System.out.println("Secuencia correcta");
          lecco++;
      }  
      else if(!cadena.equals("&&&&&")) {System.out.println("Secuencia incorrecta.Intente nuevamente");
      lecin++;
      }
      }while (!cadena.equals("&&&&&"));
        System.out.println("La cantidad de lecturas correctas fue de: "+lecco);
        System.out.println("La cantidad de lecturas incorrectas fue de: "+lecin);
      }
      
    
}
