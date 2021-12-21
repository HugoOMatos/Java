
package aulacursoemvideo;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("uma caneta " + this.cor);
        System.out.println("Esta tampada?" + this.tampada);
        System.out.println("A ponta " + this.ponta);
        System.out.println("A carga dela " + this.carga);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, caneta tampada");
        }else{
            System.out.println("Estou rabiscando");
        }
        
    }
    void tampar(){
        this.tampada =  true;
    }
    void destampar(){
        this.tampada = false;
    }
    
    
}
