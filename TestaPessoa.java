/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista31;
import pessoa1.Pessoa;
import funcionario.Funcionario;
import professor1.Professor;
/**
 *
 * @author Madalena Makiesse
 */
public class TestaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pessoa1 = new Pessoa("Pedro", "Silva");
        
        Funcionario pessoa2 = new Funcionario("Oscar", "Ribas", 123, 182.000);
        Professor pessoa3 = new Professor("Oscar", "Cardoso", 123, 1.500);
        System.out.println("pessoa1: "+pessoa1.nomeCompleto()+"\npessoa2: "+pessoa2.nomeCompleto()+"\npessoa3: "+pessoa3.nomeCompleto());
        System.out.println("Salários pessoa 2: "+pessoa2.getSalarioPrimeiraPrestacao()+",  "+pessoa2.getSalarioSegundaPrestacao());
        System.out.println("Salario pessoa 3: "+pessoa3.getSalarioPrimeiraPrestacao());
    }
    
}
