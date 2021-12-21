package aula02;
public class Aula02 {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Hugo");
        professor.setCpf("120312");
        professor.setPeriodo(Periodo.MATUTINO);
        
        
     Academico aluno = new Aluno();
     aluno.setNome("Xavier");
    Aluno aluno1 = (Aluno) aluno;
    aluno1.setMatricula(1234);
    
     
        Academico profAcademico = professor;
        Funcionario profFuncionario = professor;
        
    }
    
}
