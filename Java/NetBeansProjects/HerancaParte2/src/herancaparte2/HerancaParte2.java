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
public class HerancaParte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno a = new Aluno();
        a.setNome("Gui");
        a.setIdade(23);
        a.setMatriula(3898);
        a.setCurso("Informatica");
        a.setSexo("M");
        a.pagarMensa();
        //System.out.println(a.toString());
        Bolsista b = new Bolsista();
        b.setNome("Jonas");
        b.setIdade(20);
        b.setBolsa(12.4f);
        b.setMatriula(344);
        b.setSexo("M");
        b.pagarMensa();
        System.out.println(a.toString());
        System.out.println(b.toString());
        
    }
    
}
