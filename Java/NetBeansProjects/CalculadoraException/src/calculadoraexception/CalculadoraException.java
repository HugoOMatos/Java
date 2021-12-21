/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraexception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hugo
 */
public class CalculadoraException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora cal = new Calculadora();
      
        while(true){
            
          try{
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numerador: ");
        int numerador = entrada.nextInt();
        System.out.print("Denominador: ");
        int denominador = entrada.nextInt();
        float resultado = cal.dividir(numerador, denominador);
        System.out.println("Resultado " + resultado);
        }catch (InputMismatchException ex){
            System.err.println("Digite somente numeros");
      }
          finally{
              System.out.println("Passou no finally10");
        }
    }
  }
}
