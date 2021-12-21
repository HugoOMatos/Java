package polimorfismo;
public class Ave extends Animal {
    private String corPena;
    
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo quirelas");
    }
    @Override
    public void emitirSom(){
        System.out.println("Ave cantando");
    }
    public void fazerNInho(){
        System.out.println("Fazendo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}