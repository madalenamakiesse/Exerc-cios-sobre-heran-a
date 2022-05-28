/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista31;
import endereco1.Endereco;
import pessoa1.Pessoa;
/**
 *
 * @author Madalena Makiesse
 */
public class TestePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endereco endereco = new Endereco( "989", "W", "534"); 
        Pessoa pessoa = new Pessoa("Mif", endereco, 93233321);
        System.out.println(pessoa.getNome()+", "+pessoa.getEndereco().toString() +", "+pessoa.getTelefone());
    }
    
}
