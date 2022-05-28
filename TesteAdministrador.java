/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista31;

import administrador.Administrador;
import empregado1.Empregado;
import endereco1.Endereco;

/**
 *
 * @author Madalena Makiesse
 */
public class TesteAdministrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endereco endereco = new Endereco( "989", "W", "534"); 
        Administrador administrador = new Administrador("Ms", endereco, 93848933, "hdje23", 109229.43, 15, 8393);
        System.out.println(administrador.toString()+"\n"+administrador.calcularSalario());
    }
    
}
