
package corridadecarro;

public class Piloto {
    private String nome;
    private String nacionalidade;
    private String equipe;
    private String carro;
    private int vitoria;
    private int podium;
    private String categoria;

   

    public Piloto(String nome,String nacionalidade, String equipe, String carro, int vitoria, int podium) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.equipe = equipe;
        this.setCarro(carro);
        this.vitoria = vitoria;
        this.podium = podium;
       
    }

  
    public void apresentar(){
        System.out.println("*****Apresentação*****");
        System.out.println("Vindo direto do país " + this.getNacionalidade()
                                         + " cujo todos amam, o excelente piloto " + this.getNome());
        System.out.println("Com " + this.getVitoria() + " Vitórias ");
        System.out.println("E com boa média de colocação: " + this.getPodium() + " Chegadas ao Pódium ");
        System.out.println("Com o carro " + this.getCarro());
        System.out.println("Da categoria " + this.getCategoria());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(this.getVitoria() <20){
            this.categoria= "Amador";
        } else if(this.getVitoria() >20){
            this.categoria="Proficional"; 
        }else{
            System.out.println("Categoria inválida");
        }
     
}
    public int getPodium() {
        return podium;
    }

    public void setPodium(int podium) {
        this.podium = podium;
    }
    
    
    
}
