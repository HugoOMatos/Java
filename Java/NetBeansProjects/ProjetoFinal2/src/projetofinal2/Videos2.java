package projetofinal2;
public class Videos2 implements AcoesVideos2 {
        private String titulo;
        private int avaliacao;
        private int viewn;
        private int curtidas;
        private boolean reproduzindo;

    public Videos2(String titulo) {
        this.titulo = titulo;
        this.avaliacao=0;
        this.curtidas=0;
        this.viewn=0;
        this.reproduzindo=false;
    }
        

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViewn() {
        return viewn;
    }

    public void setViewn(int viewn) {
        this.viewn = viewn;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
        
        
    @Override
    public void play() {
        this.reproduzindo=true;
    }

    @Override
    public void pause() {
        this.reproduzindo=false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return " Videos2{ " + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", viewn=" + viewn + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
}
