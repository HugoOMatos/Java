package aula02;
public class Aluno extends Academico {
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    @Override
    public String getCodigoIdentificador() {
        return this.matricula+"" ;
    }
    
}
