package projetofinal2;
public class Visualizacao2 {
    protected Gafanhoto espectador;
    protected Videos2 filme;

    public Visualizacao2(Gafanhoto espectador, Videos2 filme) {
        this.espectador = espectador;
        this.filme = filme;
         this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViewn(this.filme.getViewn() + 1);
    }
    
public void avaliar(){
    this.filme.setAvaliacao(5);
}
public void avaliar(int nota){
    this.filme.setAvaliacao(nota);
}
public void avaliar(float porc){
     int tot = 0; // Criaçao de varialvel dentro do método
        if (porc < 20) {
            tot=3;
        } else if(porc <= 50){
            tot=5;
        }else if(porc <= 90) {
                tot=8;
            } else {
                tot=10;
            }
{
        }
            this.filme.setAvaliacao(tot);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Videos2 getFilme() {
        return filme;
    }

    public void setFilme(Videos2 filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return " Visualizacao2{ " + "espectador=" + espectador + ", filme=" + filme + '}';
    }

}

