package exerciciolivro;
public class ExercicioLivro {

    public static void main(String[] args) {
            Pessoa[] p = new Pessoa[2];
            Livro[] l = new Livro[3];
            
            p[0] = new Pessoa("Hugo", 22, "M");
            p[1] = new Pessoa("Guto", 27, "M");
            
            l[0] =  new Livro("Poo Java", "Gustavo Guanabara", 300, p[0]);
            l[1] = new Livro("A vontade de crescer", "Juan Jesus", 500, p[1]);
            l[2] = new Livro("Pra cima", "Hugo Patos", 987, p[1]);
            
            l[0].abrir();
            l[0].folhear(100);
            System.out.println(l[0].detalhes());
    }
    
}
