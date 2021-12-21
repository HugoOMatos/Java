/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author hugo
 */
public class Professor extends Academico implements Funcionario{
    private String cpf;
    private Periodo periodo;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    
    
    @Override
    public String getCodigoIdentificador() {
        return this.cpf;
    }

    @Override
    public String escalaTrabalho() {
        return periodo.name();
    }

}
