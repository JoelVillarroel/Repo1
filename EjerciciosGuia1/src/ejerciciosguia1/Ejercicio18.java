/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz 
A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        int [][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10);
            }}
        System.out.println("Matriz original");
        System.out.println("==================");
        for (int i = 0; i < 4; i++) {
                System.out.println("");
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j]+" ");
                }}System.out.println("");
        System.out.println("Matriz transpuesta");
        System.out.println("==================");
            for (int i = 0; i < 4; i++) {
                System.out.println("");
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[j][i]+" ");
                }}
    }}
