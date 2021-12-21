/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraexception;

/**
 *
 * @author hugo
 */
public class Calculadora {
    public float dividir(int numerador , int denominador) throws ArithmeticException {
        float resultado = 0;
     //  try{
        resultado = numerador / denominador;
       //}catch(ArithmeticException ex){
          // System.err.println("É impossivel fazer a divisão por 0 ");
       //}
        return resultado;
    }
    
}
