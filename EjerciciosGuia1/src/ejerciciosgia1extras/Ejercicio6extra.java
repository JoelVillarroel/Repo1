/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio6extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de personas");
        int cantidad = leer.nextInt(),cont=0;
        double promedioD=0,promedioG=0;
        for (int i = 1; i < cantidad+1; i++) {
            System.out.println("Ingrese la altura de la persona "+i);
            double altura = leer.nextDouble();
            promedioG=promedioG+altura;
            if (altura<1.6)
            cont++;
            promedioD=promedioD+altura;
        }
        promedioD=promedioD/cont;
        promedioG=promedioG/cantidad;
        System.out.println("El promedio de altura de personas que se encuentran por debajo de 1.6 es \n"+promedioD
        +"\nY la cantidad de personas contempladas en el promedio anterior son "+cont);
        System.out.println("==========================================================================");
        System.out.println("El promedio general es de "+promedioG+"\n"
        + "Contando con un total de "+cantidad+" personas");
        
    }
    
}
