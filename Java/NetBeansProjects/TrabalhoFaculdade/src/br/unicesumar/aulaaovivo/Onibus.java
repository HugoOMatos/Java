
package br.unicesumar.aulaaovivo;

import java.util.Locale;

public class Onibus {
    private String placa;
    private String modelo;
    private int portas;
    
   public  void setPlaca(String placa){              //  faz a inclusao de dados de entrada
       if((placa.length()==7)||(placa.length()==8)){
          this.placa=placa; 
       }else{
           System.out.println("Placa inválida");
       }
       
    }
    public String getPlata(){                 //recupera os dados
        return this.placa;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return this.modelo.toUpperCase(Locale.ROOT);
    }
    public void setPortas(int portas){
        if((portas>0)&&(portas<9)){
            this.portas=portas;
        }else{
            System.out.println("Quantidade de portas inválidas");
        }
        
    }
    public int getPortas(){
        return this.portas;
    }
    public String imprimir(){
        return "Onibus\n" +
                "Placa: " + this.getPlata() + "\n" +
                "Modelo: " + this.getModelo() + "\n" +
                "Portas: "+ this.getPortas() + "\n";
    }
}
