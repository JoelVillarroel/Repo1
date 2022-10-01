package Ejerciciosrefuerzo;
import java.util.Scanner;
public class EjercicioRefuerzo9 {
    public static void main(String[] args) {
    int total = 20;
    int num;
    int suma=0;
    Scanner leer = new Scanner(System.in);
        do{ 
            System.out.println("Por favor introduzca 20 numeros al azar. Ten en cuenta que si son negativos no seran sumados.");
            num=leer.nextInt();
            total=total-1;
            if (num == 0){
                System.out.println("Capturamos el 0!");}
            else if (num>0)
            {suma=suma+num;}
        }while (total > 0);
        System.out.println("El resultado de la suma de los numeros ingresados es de "+suma);
            
    }
    
}
