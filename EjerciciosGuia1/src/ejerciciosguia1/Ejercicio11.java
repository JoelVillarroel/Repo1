/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que 
se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Por favor introduzca dos numeros enteros:");
        int num1,num2,puerta=0;
        
        System.out.println("Primer numero.");
        num1=leer.nextInt();
        System.out.println("Segundo numero.");
        num2=leer.nextInt();
        do{
        System.out.println("======================");
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija una opcion por favor.");
        int opciones = leer.nextInt();
        switch (opciones){
            case 1: int suma = (num1+num2);System.out.println("La suma de los numeros ingresados es de "+suma);
            System.out.println("======================");
            break;
            case 2: int resta = (num1-num2);System.out.println("La resta de los numeros ingresados es de "+resta);
                    System.out.println("======================");
            break;
            case 3: int multiplicar =(num1*num2);System.out.println("La multiplicacion de los numeros ingresados dio como resultado "+multiplicar);
            System.out.println("======================");
            break;
            case 4: int dividir = (num1/num2);System.out.println("La division del primer numero por el segundo numero fue de "+dividir);
            System.out.println("======================");
            break;
            case 5: System.out.println("Salio del Programa");
            puerta=5;
            System.out.println("======================");
            break;
        }
        }while(puerta != 5);
        }
    }

    

