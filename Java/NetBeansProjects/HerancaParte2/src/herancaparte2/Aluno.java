/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaparte2;

/**
 *
 * @author hugo
 */
public class Aluno extends Pessoa {
    private int matriula;
    private String curso;

    public void pagarMensa(){
        System.out.println("Pagando mensalidade de aluno " + this.getNome());
    }
    public int getMatriula() {
        return matriula;
    }

    public void setMatriula(int matriula) {
        this.matriula = matriula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
