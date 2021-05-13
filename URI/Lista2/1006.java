import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    
        Double A = scan.nextDouble() * 2;
        Double B = scan.nextDouble() * 3;
        Double C = scan.nextDouble() * 5;
        Double Media= (A+B+C)/10;
        
            System.out.printf("MEDIA = %.1f\n",Media);
        
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 
    }
 
}