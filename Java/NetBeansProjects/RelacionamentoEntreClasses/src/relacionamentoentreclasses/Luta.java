package relacionamentoentreclasses;

import java.util.Random;

public class Luta {
    private Lutador desafiado; 
    private Lutador desafiante; // Instancia criada da classe Lutador(tipo abstrato de dados)
    private int rouds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
       if(this.aprovada){
           System.out.println("***Desafiado***" + this.desafiado.getNome());
           this.desafiado.apresentar();
           System.out.println("***Desafiante***" + this.desafiante.getNome());
           this.desafiante.apresentar();
           
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3);
           System.out.println("=====Resultado da Luta====");
           switch(vencedor){
               case 0: 
                   System.out.println("Empatou");
                   this.desafiado.empatarLuta();
                   this.desafiante.empatarLuta();
                   break;
               case 1:
                   System.out.println("Vitoria do " + this.desafiado.getNome());
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLuta();
                   break;
               case 2:
                   System.out.println("Vitoria do " + this.desafiante.getNome());
                   this.desafiado.perderLuta();
                   this.desafiante.ganharLuta();
                   break;
           }
           System.out.println("========================");
       }else{
           System.out.println("A luta não pode acontecer");
       }
    }
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
