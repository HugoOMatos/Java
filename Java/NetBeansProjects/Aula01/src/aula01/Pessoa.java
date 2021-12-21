/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

/**
 *
 * @author hugo
 */
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    /**
     *
     * @param idade
     */
    public void setIdade(int idade) throws IdadeException  {
        if((idade <= 0) || (idade > 100))
            throw new IdadeException();
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa {" + "nome=" + nome + ", idade=" + idade + '}';
    }
    
    
    
    
}
