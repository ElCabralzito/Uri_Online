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
    Scanner scan = new Scanner (System.in);
    
        String Nome = scan.next();
        double Salario = scan.nextDouble();
        double Vendas = scan.nextDouble();
        
        double comissao = Vendas*0.15;
        double total = comissao + Salario;
        
        System.out.printf("TOTAL = R$ %.2f\n", total);
    
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 
    }
 
}