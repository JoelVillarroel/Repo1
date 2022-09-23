/*
Realice un programa que compruebe si una matriz dada es anti simétrica. 
Se dice que una matriz A es anti simétrica cuando ésta es igual a su 
propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica 
si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejerciciosguia1;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero de filas");
        int fil=leer.nextInt();
        System.out.println("Ingresa el numero de columnas");
        int col=leer.nextInt();
        int matriz[][]=new int [fil][col];
        boolean simetrica=true;
        for (int i = 0; i < fil; i++) {
            System.out.println("Por favor ingresa los datos de la fila "+(i+1));
            for (int j = 0; j < col; j++) {
                matriz[i][j]=leer.nextInt();
                
                }
            }
        if (col==fil){
            for (int i = 0; i < fil; i++) {
                for (int j = 0; j < col; j++) {
                    if (matriz[i][j]!=matriz[j][i]){
                    simetrica=false;
                    break;
                    }
                }
                if (simetrica==false){break;}
            }
        }
        else {
            System.out.println("La matriz es antisimetrica");
        }  
        if (simetrica==true){System.out.println("La matriz es simetrica");}
        else{System.out.println("La matriz es antisimetrica");}
        }
}       
    
    

