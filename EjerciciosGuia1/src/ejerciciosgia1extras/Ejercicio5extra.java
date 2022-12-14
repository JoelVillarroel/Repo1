/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package ejerciciosgia1extras;
import java.util.Scanner;
public class Ejercicio5extra {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el tipo de socio\n"
                + "A; B; C;");
       String opcion = leer.next();
       while (!opcion.equalsIgnoreCase("A") && !opcion.equalsIgnoreCase("B") && !opcion.equalsIgnoreCase("C")){
           System.out.println("Incorrecto intente nuevamente");
           opcion=leer.next();
       }
        System.out.println("Por favor introduzca el monto del tratamiento");
        double tratamiento = leer.nextDouble();
       switch (opcion){
           case "a":
           case "A":System.out.println("El importe en efectivo a pagar para el socio tipo "+opcion.toUpperCase()+" es $$"+tratamiento*0.5+".\nSe aplica un descuento de 50%.");
           break;
           case "b":
           case "B":System.out.println("El importe en efectivo a pagar para el socio tipo "+opcion.toUpperCase()+" es $$"+tratamiento*0.65+".\nSe aplica un descuento de 35%.");
           break;
           case "c":
           case "C":System.out.println("El importe en efectivo a pagar para el socio tipo "+opcion.toUpperCase()+" es $$"+tratamiento+".\nNo posee descuentos.");
           break;
       }
       
       
    }
    
}
