package equacaosegundograu;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        int delta;
        int x1;
        int x2;
        int raiz;

        try{
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor de A: ");

        int a = entrada.nextInt();

        System.out.print("Entre com o valor de B: ");

        int b = entrada.nextInt();

        System.out.print("Entre com o valor de C: ");

        int c = entrada.nextInt();

        if(a != 0){

            delta = b*b * 4 * a * c;

        if(delta >= 0)
        {
                  x1 = (int) (( -b + (Math.sqrt (delta))) / ( 2*a ));

                 x2 = (int) (( -b + (Math.sqrt (delta) ) ) / ( 2*a ));

                 System.out.println("O valor de x1 e: "+x1);
                 System.out.println("O valor de x2 e: "+x2);

          }

      }
        
        }catch(ArithmeticException ex){
            System.err.println("Impossivel fazer uma equação com 0 ");
        }
    }
    
}
    
    

