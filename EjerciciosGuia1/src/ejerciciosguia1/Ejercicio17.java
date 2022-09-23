/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 
dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Por favor introduzca el tamaño del vector");
    int tamaño = leer.nextInt();
    int uno=0,dos=0,tres=0,cuatro=0,cinco=0;
    int []vector = new int [tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Introduzca el valor de la posicion "+i);
            vector[i]=leer.nextInt();
            if (vector[i]<=99999){System.out.println("Dato guardado");
            }else{System.out.println("Dato incorrecto intente nuevamente.Solo se permiten hasta 5 digitos");
            i--;}
        }
        for (int i = 0; i <tamaño; i++) {
            if (vector[i]>=0 && vector[i]<10){uno++;}
            else if (vector[i]>=10 && vector[i]<100){dos++;}
            else if (vector[i]>=100 && vector[i]<1000){tres++;}
            else if (vector[i]>=1000 && vector[i]<10000){cuatro++;}
            else if (vector[i]>=10000 && vector[i]<100000){cinco++;}
        }
            

        if (uno>0){System.out.println("La cantidad de numeros de un digito ingresados fueron "+uno);}
        if (dos>0){System.out.println("La cantidad de numeros de dos digitos ingresados fueron "+dos);}
        if (tres>0){System.out.println("La cantidad de numeros de tres digitos ingresados fueron "+tres);}
        if (cuatro>0){ System.out.println("La cantidad de numeros de cuatro digitos ingresados fueron "+cuatro);}
        if (cinco>0){System.out.println("La cantidad de numeros de cinco digitos ingresados fueron "+cinco);}
        
    } 
    }  
