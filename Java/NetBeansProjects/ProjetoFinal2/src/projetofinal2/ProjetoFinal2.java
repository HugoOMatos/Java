package projetofinal2;

public class ProjetoFinal2 {
    public static void main(String[] args) {
        Videos2[]v = new Videos2[2];
        v[0] =  new Videos2("Curso em Video");
        v[1] = new Videos2("Gustavo Guanabara");
        
        Gafanhoto [] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Hugo", 23,"M", "0001");
        g[1] = new Gafanhoto("Mari", 25, "F", "0002");
        
        Visualizacao2 [] f = new Visualizacao2[2];
        f[0] = new Visualizacao2(g[0],v[0]);
        f[1] = new Visualizacao2(g[1],v[1]);
       
        System.out.println(f[1].toString());
        f[1].avaliar(10);
      //  f[1].setFilme(filme);
    }
    
}
