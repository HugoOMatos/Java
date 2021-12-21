package heranca;
public class Heranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionaria p4 = new Funcionaria();
        
        p1.setNome("Tiago");
        p2.setNome("Helena");
        p3.setNome("Julio");
        p4.setNome("Tiao");
        
        p2.setIdade(25);
        p2.setSexo("F");
        p2.setCurso("Informatica");
        p3.setSalario(2.500f);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
