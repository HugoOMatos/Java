package numeros;
import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner (System.in); // entrada de valores digitada pelo usuario
        do{
             System.out.print("Digite um número: ");
             n = teclado.nextInt(); // guarda o numero digitado acima na variavel N
             s +=n;
            System.out.println("Deseja continuar? [S/N] ");
           resp= teclado.next(); // usuario deseja se quer continuar ou não

        }    while(resp.equals("s") );
        System.out.println("A soma dos números foram:  " + s);

    }
    
}
