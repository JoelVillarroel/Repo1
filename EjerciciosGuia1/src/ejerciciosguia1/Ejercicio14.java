/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejerciciosguia1;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
         menu();
    } 
    public static void menu(){
        Scanner leer = new Scanner(System.in);
        int opcion=0;
           System.out.println("Por favor ingrese la cantidad a cambiar");
        double euro = leer.nextDouble();
        System.out.println("A continuacion elija a que moneda desea realizar el cambio");
        System.out.println("1. Libras");
        System.out.println("2. Dolares");
        System.out.println("3. Yenes");
        System.out.println("4. Salir");
        do{opcion = leer.nextInt();
        double libra = euro*0.86,dolar=euro*1.28611,yenes=euro*129.852;
        switch (opcion){
            case 1: 
                System.out.println("El monto en libras es "+libra);
            break;
            case 2: System.out.println("El monto en dolares es "+dolar);
            break;
            case 3: System.out.println("El monto en yenes es "+yenes);
            default: if (opcion != 4) {System.out.println("Opcion incorrecta vuelva a intentarlo");}
        }
        }while (opcion!=4);    
    }
}
