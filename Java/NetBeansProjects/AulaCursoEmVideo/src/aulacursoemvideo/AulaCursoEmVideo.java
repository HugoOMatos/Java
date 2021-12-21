
package aulacursoemvideo;


public class AulaCursoEmVideo {

  
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.carga= 7;
        caneta.cor="preta";
        caneta.modelo="big";
        caneta.ponta=6;
       
        caneta.tampar();
        caneta.rabiscar();
        caneta.status();
        
        System.out.println("-------------------------------------------------------");
       
        Caneta caneta2 = new Caneta();
        caneta.carga=8;
        caneta.cor="Amarela";
        caneta.modelo="Faber";
        caneta.ponta=9;
        
        caneta.status();
        caneta.destampar();
        caneta.rabiscar();
        
   }
    
}
