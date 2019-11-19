package array02;
import java.util.Scanner;

public class Array02 {

        public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int[] x = new int[5];
        x[0]= 8;
        x[1]=33;
        x[2] =200;
        x[3]=150;
        x[4]=11;
        System.out.println("El array x tiene 5 elementos, ¿Cuál de ellos quiere ver?");
        System.out.print("Introduzca un número del 0 al 4:");
        int indice = teclado.nextInt();
        System.out.print("El elemento que se ecuentra en la posición " + indice);
        System.out.println(" es el " + x[indice]);

        } 
    
}
