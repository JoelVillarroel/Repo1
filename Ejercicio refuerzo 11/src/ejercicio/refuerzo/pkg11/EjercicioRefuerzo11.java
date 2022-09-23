
package ejercicio.refuerzo.pkg11;
import java.util.Scanner;
public class EjercicioRefuerzo11 {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese una cadena de caracteres que termine en .");
               Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca una frase.");
        String frase;
        frase = leer.nextLine();
        char ultimo;
     if ((ultimo) ! (".")){
       do{
       int longitud = frase.length();
       int contador = frase.length();
        ultimo = frase.charAt(longitud-1);
        System.out.println(ultimo);}(ultimo)!("."); 
        {
    }
    }   
}
/*public class Sample_String {   
    public static void main(String[] args) {       

        // declara la cadena como un objeto S1 S2       
        String S1 = "Hola método de cadena Java";       
        String S2 = "RockStar";       

        // El método length () de String devuelve la longitud de una cadena S1.       
        int length = S1.length();       
        System.out.println("Longitud de una cadena es:" + longitud);       
        // 8 Longitud de una cadena RockStar     
        System.out.println("Longitud de una cadena es:" + S2.length());*/