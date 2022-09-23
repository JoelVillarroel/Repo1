/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machete;
import java.util.Random;
import java.util.Scanner;
public class Machete {

    public static void main(String[] args) {
        //Ultimo digito
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca una frase.");
        String frase = leer.nextLine();
        char ultimo;
        int longitud = frase.length();
        ultimo = frase.charAt(longitud-1);
        System.out.println(ultimo); 
    }
}