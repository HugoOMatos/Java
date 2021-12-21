/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo2;

/**
 *
 * @author hugo
 */
public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("Au au au au");
    }
    public void reagir(String frase){// SOBRECARGA
        if(frase.equals("Toma comida")  || frase.equals( "Olá") ){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int  min){
        if (hora < 12) { 
            System.out.println("Abanar o rabo");
        } else if(hora >= 18) {
            System.out.println("Ignorar");
        }else
            System.out.println("Abanar e latir");
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e latir");
            this.emitirSom();
        }
        
    }
    public void reagir(int idade, float peso){
        if(idade <5){
            if(peso < 10){
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }if(peso<10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
}
