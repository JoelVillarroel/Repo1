/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejerciciosguia1;

import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int filas=3;int columnas=3;
        int matriz[][]=new int [filas][columnas];       
        System.out.println("Por favor introduzca numeros del 1 al 9");
        for (int i = 0; i < filas; i++) {                                           
            for (int j = 0; j < columnas; j++) { 
            System.out.println("Introduzca el valor de la posicion "+i+","+j);
            matriz[i][j]=leer.nextInt();
            while (matriz[i][j]<1 ||matriz[i][j]>9){
                System.out.println("Incorrecto.Intente de nuevo.");
                matriz[i][j]=leer.nextInt();}
                    
                        
            }
        }
        for (int i = 0; i < filas; i++) {
            System.out.println("");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            
        }
        System.out.println("");
        int fil=0;int col=0;int diagonal=0;int diagIn=0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
             if (i==0 && j>=0){fil+=matriz[i][j];
            }
             if (i==j){diagonal+=matriz[i][j];}
            
             if(j==0 && i>=0){col+=matriz[i][j];}
            if ((i+j)==2){diagIn+=matriz[i][j];}
        
            }
            
           
    }
        if (diagonal==col && col==fil && diagonal==diagIn){System.out.println("La matriz es magica");}
        else{System.out.println("La matriz no es magica");}
     System.out.println("La diagonal vale "+diagonal);
            System.out.println("La columna vale "+col+"\n"
                    + "La fila vale "+fil);
}
}
