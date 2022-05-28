/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista31;

import endereco1.Endereco;
import fornecedor1.Fornecedor;

/**
 *
 * @author Madalena Makiesse
 */
public class TesteFornecedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endereco endereco = new Endereco( "989", "W", "534"); 
        Fornecedor fornecedor = new Fornecedor("Ns", endereco, 938339393, 2.4, 0.3);
        System.out.println(fornecedor.toString());
        fornecedor.setTelefone(4848392);
        System.out.println(fornecedor.toString());
    }
    
}
