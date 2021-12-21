
package aulacursoemvideo;


public class AulaCursoEmVideo {

  
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.modelo="Big";
        caneta.cor="azul";
        //caneta.ponta=0.8f;
        caneta.carga=90;
        //caneta.tampada = false;
        caneta.tampar();
        caneta.rabiscar();
    
        caneta.status();
       
        
   }
    
}
