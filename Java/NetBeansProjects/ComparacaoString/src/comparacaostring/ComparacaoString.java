/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author hugo
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Hugo";
        String nome2 = "Hugo";
        String nome3 = new String("Hugo");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";//equals compara se o conteudo de uma string é igual ao conteudo de outra
        System.out.println(res);
        
        
    }
    
}
