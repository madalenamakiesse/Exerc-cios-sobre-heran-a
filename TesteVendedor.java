/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista31;
import empregado1.Empregado;
import endereco1.Endereco;
import vendedor.Vendedor;
/**
 *
 * @author Madalena Makiesse
 */
public class TesteVendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endereco endereco = new Endereco( "989", "W", "534"); 
        Vendedor vendedor = new Vendedor("Ms", endereco, 93848933, "hdje23", 109229.43, 15, 32, 4);
        System.out.println(vendedor.toString()+"\n"+vendedor.calcularSalario());
    }
    
}
