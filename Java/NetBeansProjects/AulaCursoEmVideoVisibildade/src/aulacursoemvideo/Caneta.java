
package aulacursoemvideo;

public class Caneta {
   public  String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;
    
    public void status(){
        System.out.println("uma caneta " + this.cor);
        System.out.println("Esta tampada?" + this.tampada);
        System.out.println("A ponta " + this.ponta);
        System.out.println("A carga dela " + this.carga);
        System.out.println("Modelo da caneta " + this.modelo);
    }
    
  public  void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, caneta tampada");
        }else{
            System.out.println("Estou rabiscando");
        }
        
    }
   public  void tampar(){
        this.tampada =  true;
    }
   public  void destampar(){
        this.tampada = false;
    }
    
    
}
