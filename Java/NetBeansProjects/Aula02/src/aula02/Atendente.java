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
public class Atendente  implements Funcionario{
    private String escala;

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }
    
    @Override
    public String escalaTrabalho() {
        return this.getEscala();
    }
    
}
