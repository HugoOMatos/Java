package equacao;

import java.util.Scanner;

public class Equacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = 0, b = 0, c ;
       double delta=0;
        try{
        System.out.print("Digite o número A: ");
        a = ler.nextInt();
        
        System.out.print("Digite o número B: ");
        b = ler.nextInt();
        
        System.out.print("Digite o número C: ");
        c = ler.nextInt();
        
        delta = Math.pow(b, 2) - (4 * a * c);
        
        if(delta < 0){
          
        }
        if(delta == 0 ){
            double x;
            x = -b / (2 * a);
            System.out.println("x1 e x2  = " + x );
        }
       
        if(delta > 0){
            double x1, x2;
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
       }catch(ArithmeticException ex){
           System.err.println("Digite números maiores que 0 ");
       }
    }
 }
    

