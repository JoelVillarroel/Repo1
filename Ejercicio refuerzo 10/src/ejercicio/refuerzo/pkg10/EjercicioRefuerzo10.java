package ejercicio.refuerzo.pkg10;
import java.util.Scanner;
public class EjercicioRefuerzo10 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Por favor introduzca 4 numeros al azar");
        int num1;int num2;int num3;int num4;
        { do{System.out.println("Ingrese el primer numero");num1=leer.nextInt();}while (num1 < 1 || num1 > 20);
       do{System.out.println("Ingrese el segundo numero");num2=leer.nextInt();}while (num2 < 1 || num2 > 20);
       do{System.out.println("Ingrese el tercer numero");num3=leer.nextInt();}while (num3 < 1 || num3 > 20);
       do{System.out.println("Ingrese el cuarto numero");num4=leer.nextInt();}while (num4 < 1 || num4 > 20);}
        { System.out.println("=====================");
            System.out.print(num1+" ");
        for (int i=0;i<num1;i++){
        System.out.print("*");}
        System.out.println("");
        System.out.print(num2+" ");
        for (int i=0;i<num2;i++){
        System.out.print("*");}
        System.out.println("");
        System.out.print(num3+" ");
        for (int i=0;i<num3;i++){
        System.out.print("*");}
        System.out.println("");
        System.out.print(num4+" ");
        for (int i=0;i<num4;i++){
        System.out.print("*");}
        System.out.println("");}
    }
    }
    
