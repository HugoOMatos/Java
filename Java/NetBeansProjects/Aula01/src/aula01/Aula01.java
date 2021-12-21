package aula01;

import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
     
        do{
        
            try{
            Scanner teclado = new Scanner (System.in);
            System.out.println("Informe o nome: ");
            String resp = teclado.nextLine();
            pessoa.setNome(resp);
        
            System.out.println("Informe a idade:" );
            teclado = new Scanner (System.in);
            int idade = teclado.nextInt();
            pessoa.setIdade(idade);
        
            System.out.println(pessoa);
            break;
        
        
            }catch(IdadeException e){
                System.err.println(e.getMessage());
        } 
     
        }while(true);
    }
    
}
