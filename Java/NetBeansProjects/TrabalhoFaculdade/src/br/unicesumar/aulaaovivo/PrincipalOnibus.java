package br.unicesumar.aulaaovivo;

public class PrincipalOnibus {
    public static void main(String[]args){
        
        Onibus primeiroOnibus = new Onibus();
            primeiroOnibus.setPlaca("pla0000");
            primeiroOnibus.setModelo("bus");
           primeiroOnibus.setPortas(2);
        
        
        Onibus segundoOnibus = new Onibus();
            segundoOnibus.setPlaca("pla2222");
            segundoOnibus.setModelo("nos");
            segundoOnibus.setPortas(5);
        
        
       /* System.out.println("primeiroOnibus = " +primeiroOnibus.getPlata()+"\n" + "modelo: " + primeiroOnibus.getModelo()+"\n" + "portas " + primeiroOnibus.getPortas() );*/
          System.out.println("Primeiro Onibus: " + primeiroOnibus.imprimir());
         System.out.println("Segundo Onibus: " + segundoOnibus.imprimir());
        
    }
    
}
