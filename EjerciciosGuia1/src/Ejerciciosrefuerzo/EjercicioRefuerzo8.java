package Ejerciciosrefuerzo;
import java.util.Scanner;
public class EjercicioRefuerzo8 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num;
        System.out.println("Por favor ingrese un numero que se encuentre entre el 1 y el 10");
        num = leer.nextInt();
        if (num >= 1 && num <= 10){
            System.out.println("El numero ingresado se encuentra entre el 1 y el 10");
        } else if (num > 10 || num < 1 ){
while (num > 10 || num < 1 ){
        System.out.println("El numero ingresado no se encuentra entre el 1 y el 10 por favor intente nuevamente");
        num = leer.nextInt();
        if (num >=1 || num <=10){System.out.println("El numero ingresado se encuentra entre el 1 y el 10");}
}}}}