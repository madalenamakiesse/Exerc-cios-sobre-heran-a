/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista31;

import empregado1.Empregado;
import endereco1.Endereco;

/**
 *
 * @author Madalena Makiesse
 */
public class TesteEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endereco endereco = new Endereco( "989", "W", "534"); 
        Empregado empregado = new Empregado("Ms", endereco, 93848933, "hdje23", 109229.43, 15);
        System.out.println(empregado.toString()+"\n"+empregado.calcularSalario());
        
    }
    
}
