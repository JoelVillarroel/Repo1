/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio16extra {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int cont=1,edad=0;  
    String resp="si",nombre=null,m=null;
    while (!resp.equalsIgnoreCase("no")){
        System.out.println("Ingrese el nombre del "+cont+" individuo");
        cont++;
        nombre=leer.nextLine();
        System.out.println("Ingrese la edad de "+nombre);
        edad=leer.nextInt();
        if (edad >= 18){
        m=". Es mayor mayor de edad.";
        }else{m=". Es menor de edad.";}
        System.out.println("=================================");
        
        System.out.println("Individuo "+nombre+" edad: "+edad+m);
        
        System.out.println("=================================");
        
        System.out.println("Desea seguir ingresando personas?");
        resp=leer.nextLine();
        resp=leer.nextLine();
    }
        }
                
    }
    
