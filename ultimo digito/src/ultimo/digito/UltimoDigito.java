/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimo.digito;

/**
 *
 * @author Joel
 */
public class UltimoDigito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
                char ultimo;
        int longitud = frase.length();
        ultimo = frase.charAt(longitud-1);
        System.out.println(ultimo); 
    }
    
}
