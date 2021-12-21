package aulacursoemvideosistemabancario;

public class AulaCursoEmVideoSistemaBancario {

 public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(308);
        conta1.setCliente("Hugo");
        conta1.abrirConta("c/c");
        
        
        
        
        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(900);
        conta2.setCliente("Creuza");
        conta2.setTipoConta("c/p");
        
        conta1.depositar(100);
        conta2.depositar(500);
        conta1.estadoAtual();
        conta2.estadoAtual();
        
    }
    
}
