package aulacursoemvideometodosespeciais;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampado;

    public Caneta(String modelo, String cor, float ponta, boolean tampado) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampado = tampado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampado() {
        return tampado;
    }

    public void setTampado(boolean tampado) {
        this.tampado = tampado;
    }
    
    
}

   
    
    
   