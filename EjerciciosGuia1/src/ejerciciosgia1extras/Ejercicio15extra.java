/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio15extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor indique la opcion que desea realizar");
        System.out.println("--MENU--\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir");
        int opcion = leer.nextInt(),num1,num2;
        switch (opcion){
            case 1:System.out.println("Por favor ingrese el primer numero");
            num1=leer.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2=leer.nextInt();
                System.out.println("==========================");
                System.out.println(num1+" + "+num2+" = "+sumar(num1,num2));
                System.out.println("==========================");
                break;
            case 2:System.out.println("Por favor ingrese el primer numero");
            num1=leer.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2=leer.nextInt();
                System.out.println("==========================");
                System.out.println(num1+" - "+num2+" = "+restar(num1,num2));
                System.out.println("==========================");
                break;
            case 3:System.out.println("Por favor ingrese el primer numero");
            num1=leer.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2=leer.nextInt();
                System.out.println("==========================");
                System.out.println(num1+" x "+num2+" = "+multiplicar(num1,num2));
                System.out.println("==========================");
                break;
            case 4:System.out.println("Por favor ingrese el primer numero");
            num1=leer.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2=leer.nextInt();
                System.out.println("==========================");
                System.out.println(num1+" / "+num2+" = "+dividir(num1,num2));
                System.out.println("==========================");
                break;}
            
    }
    public static int sumar(int num1,int num2){
    int sumar=num1+num2;
    return sumar;
}
    public static int restar(int num1,int num2){
    int restar=num1-num2;
    return restar;}
        public static int multiplicar(int num1,int num2){
    int multiplicar=num1*num2;
return multiplicar;
}
public static int dividir(int num1,int num2){
int dividir=num1/num2;
return dividir;}
}