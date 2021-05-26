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
    
    Double A = scan.nextDouble() * 3.5;
    Double B = scan.nextDouble() * 7.5;
    Double Media= (A+B)/11;
    
        System.out.printf("MEDIA = %.5f\n", Media);
 
    }
 
}