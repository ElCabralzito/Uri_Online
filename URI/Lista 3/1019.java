import java.io.IOException;
import java.util.Scanner;

  IMPORTANT 
       O nome da classe deve ser Main para que a sua solução execute
       Class name must be Main for your solution to execute
       El nombre de la clase debe ser Main para que su solución ejecutar
 
public class Main {
 public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int duracaoSegundos = leitor.nextInt();
        int horas = duracaoSegundos  3600;
        duracaoSegundos -= horas  3600;
        int minutos = duracaoSegundos  60;
        duracaoSegundos -= minutos  60;
        int segundos = duracaoSegundos;
         System.out.println(horas +  + minutos +  + segundos);	
    }
 
}