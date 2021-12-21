package projetofinal;
public class ProjetoFinal {
    public static void main(String[] args) {
  Video v[]= new Video[5];
        v[0] = new Video("Poo");
        v[1] = new Video("Cursoem Video");
        v[2] = new Video("Realizando metas");
        v[3] = new Video("Java");
        v[4] = new Video("PHP");

        Usuario u[]= new Usuario[2];
        
        u[0] = new Usuario("Hugo", 22, "M", "0001");
        u[1] = new Usuario("Mari", 24, "F", "0002");
        
        Visualizacao vis[] = new Visualizacao[3];
        vis[0]= new Visualizacao(u[0], v[2]);
        
     
        vis[1] = new Visualizacao(u[1], v[1]);
        System.out.println(vis[1].toString());
        vis[1].avaliar();
        vis[2] = new Visualizacao(u[1], v[4]);
        System.out.println(vis[1].toString());
        vis[2].avaliar(87.0f);
        

        /*  System.out.println("------------Videos-------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(v[3].toString());
        System.out.println(v[4].toString());
        
        System.out.println("-------Usuarios-------");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());*/
      
      
    }
    
}
