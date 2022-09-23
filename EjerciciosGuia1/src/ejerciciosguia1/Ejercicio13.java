/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero");
    int num = leer.nextInt();
        for (int i = 0; i < num; i++) 
        {for (int j = 0; j < num; j++) {
           if (i==0 && j<num-1){System.out.print("*");}
           else if (j==0 && i>=0){System.out.print("*");}
           else if (i==num-1 && j<num-1){System.out.print("*");}
           else if (j==num-1 && i>=0){System.out.println("*");}
           else {System.out.print(" ");}
            }}
            
        }
    }
    

