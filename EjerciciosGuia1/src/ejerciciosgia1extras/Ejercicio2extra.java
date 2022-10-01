/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio2extra {
    public static void main(String[] args) {
        int A=15,B=17,C=19,D=10,aux;
        System.out.println("Los valores iniciales son:\n"
                +"A="+A+"\n"
                +"B="+B+"\n"
                +"C="+C+"\n"
                +"D="+D+"\n");
        aux=B;
        B=C;/*este es c*/
        C=A;
        A=D;
        D=aux;    
        System.out.println("A partir de aqui los valores son los siguientes: A=D; B=C; C=A; D=B");
        System.out.println("Los valores finales son:\n"
                +"A="+A+"\n"
                +"B="+B+"\n"
                +"C="+C+"\n"
                +"D="+D+"\n");
        
        
        
        
    }
    
}
