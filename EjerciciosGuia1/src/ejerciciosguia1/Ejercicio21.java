/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y 
la matriz P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*int MatrizM[][]=new int [10][10];*/
        /*int MatrizP[][]=new int [3][3];*/
        int MatrizM[][] = {
        {1,26,36,47,5,6,72,81,95,10},
        {11,12,13,21,41,22,67,20,10,61},
        {56,78,87,90,9,90,17,12,87,67},
        {41,87,24,56,97,74,87,42,64,35},
        {32,76,79,1,35,5,67,96,12,11},
        {99,13,54,88,89,90,75,12,41,76},
        {67,78,87,45,14,22,26,42,56,78},
        {98,45,34,23,32,56,74,16,19,18},
        {24,67,97,46,87,13,67,89,93,24},
        {21,68,78,98,90,67,12,41,65,12}
        
    };
        int MatrizP[][]={
        {35,5,67},
        {89,90,75},
        {14,22,26}
    };int cont=0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (MatrizP[0][0]==MatrizM[i][j]&& MatrizP[0][1]==MatrizM[i][(j+1)] && MatrizP[0][2]==MatrizM[i][j+2]){
                    System.out.println("Perfecto!!La MatrizP se encuentra dentro de la MatrizM en las siguientes coordenadas!");
                    System.out.println("("+i+","+j+")-("+i+","+(j+1)+")-("+i+","+(j+2)+")");cont++;}
                    else if (MatrizP[1][0]==MatrizM[i][j] && MatrizP[1][1]==MatrizM[i][(j+1)] && MatrizP[1][2]==MatrizM[i][(j+2)])
                    {System.out.println("("+i+","+j+")-("+i+","+(j+1)+")-("+i+","+(j+2)+")");cont++;}
                    else if  (MatrizP[2][0]==MatrizM[i][j] && MatrizP[2][1]==MatrizM[i][(j+1)]&& MatrizP[2][2]==MatrizM[i][(j+2)]){
                        {System.out.println("("+i+","+j+")-("+i+","+(j+1)+")-("+i+","+(j+2)+")");cont++;}
                }
                    else if (i==9 && j==9 && cont<3){System.out.println("La matriz no se encuentra dentro de la matriz mayor");
                }
                
                    
            }
        }}
            }

