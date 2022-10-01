/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio10extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double multiplo1,multiplo,resultado,respuesta,cont=1;
        multiplo1=(Math.random()*10);
        double enterom1=(multiplo1/1),decimalm1=multiplo1%1;
        enterom1=enterom1-decimalm1;
        multiplo=Math.random()*10;
        double enterom=multiplo/1,decimalm=multiplo%1;
        enterom=enterom-decimalm;
        System.out.println(enterom1+""+enterom);
        resultado=enterom1*enterom;
        double enteror=resultado/1;
        System.out.println("A QUE NO ADIVINAS!!!\n"
                + " Ingresa un numero para adivinar el resultado de una multiplicacion entre dos numeros del 0 al 10 ");
        respuesta=leer.nextDouble();
        while(respuesta!=enteror){
            System.out.println("Incorrecto intente nuevamente");
            cont++;
            respuesta=leer.nextDouble();
        }
            
    }
    
}
