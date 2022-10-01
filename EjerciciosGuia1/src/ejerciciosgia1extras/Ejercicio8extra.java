/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio8extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese numeros enteros");
        int numero,cont=0,contp=0,conti=0;
        do{
        numero=leer.nextInt();
        cont++;
        if (numero%2==0){
            contp++;
        }else{conti++;}
        if (numero<0){
            System.out.println("Dato incorrecto intente nuevamente");
            cont--;
            numero=leer.nextInt();
            cont++;
        }
        }while (numero%5!=0);
        System.out.println("La cantidad de numeros ingresados fueron "+cont);
        if (contp>0){System.out.println("La cantidad de numeros pares fueron "+contp);}
        if (conti>0){System.out.println("La cantidad de numeros impares fueron "+conti);}
    }
    
}
