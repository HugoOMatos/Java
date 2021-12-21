package exerciciopessoa;
public class ExercicioPessoa {
    public static void main(String[] args) {
            Pessoa [] p = new Pessoa [2];
            Livro[] l = new Livro [3];
            
            p[0] = new Pessoa("Hugo", 23, "M");
            p[1]= new Pessoa("Mari", 24, "F");
            
            l[0] = new Livro("A Rebeliao", "Jose Nill", 209, p[0]);
            l[1] = new Livro("A Salvação", "Tulio Vaz", 310, p[1]);
            l[2] = new Livro("Em nome", "Luci ", 233, p[0]);
            
            l[1].abrir();
            l[1].folhear(3);
            System.out.println(l[1].detalhes());
            
    }
    
}
