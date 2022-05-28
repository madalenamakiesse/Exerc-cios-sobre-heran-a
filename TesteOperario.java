/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista31;
import endereco1.Endereco;
import operario.Operario;

/**
 *
 * @author Madalena Makiesse
 */
public class TesteOperario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endereco endereco = new Endereco("re", "ded", "de");
        Operario operario = new Operario("Ms", endereco, 93848933, "hdje23", 109229.43, 15, 8393, 54);
        System.out.println(operario.toString()+", "+operario.calcularSalario());
        operario.setComissao(12);
        System.out.println(operario.toString()+", "+operario.calcularSalario());
    }
    
}
