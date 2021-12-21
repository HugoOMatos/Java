
package corridadecarro;

import java.util.Random;

public class Corrida {
    private Piloto corredor1;
    private Piloto corredor2;
    private int voltas;
    private boolean aprovada;

   public void corrida(){
       if(this.aprovada){
           System.out.println("000Apresentendo Corredor 1!");
           this.corredor1.apresentar();
           System.out.println("000Apresentendo Corredor 2");
           this.corredor2.apresentar();
           
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3);
           System.out.println("====================");
           switch(vencedor){
               case 0:
                   System.out.println("Nenhum subiu ao pódio");
                   break;
               case 1:
                   System.out.println("Vitoria do " + this.corredor1.getNome());
                   break;
               case 2:
                   System.out.println("Vitoria do " + this.corredor2.getNome());
                   break;
           }
       }
       
   }
  
   public void marcarCorrida(Piloto p0, Piloto p1){
     if(p0.getCategoria().equals(p1.getCategoria()) && p0 !=p1){
          this.aprovada = true;
        this.corredor1=p0;
        this.corredor2=p1;
     }else{
         this.aprovada= false;
         this.corredor1=null;
         this.corredor2=null;
     }
        
   }
    
   public Piloto getCorredor1() {
        return corredor1;
    }

    public void setCorredor1(Piloto corredor1) {
        this.corredor1 = corredor1;
    }

    public Piloto getCorredor2() {
        return corredor2;
    }

    public void setCorredor2(Piloto corredor2) {
        this.corredor2 = corredor2;
    }

    public int getVoltas() {
        return voltas;
    }

    public void setVoltas(int voltas) {
        this.voltas = voltas;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
  
    
}
