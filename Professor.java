/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor1;
import funcionario.Funcionario;
import pessoa1.Pessoa;
/**
 *
 * @author Madalena Makiesse
 */
public class Professor extends Funcionario{
    private double salario;
    public Professor(String nome, String sobrenome, int matricula, double salario){
        super(nome, sobrenome, matricula, salario);
    }
    @Override
    public void setMatricula(int matricula){
        super.setMatricula(matricula);
    }
    @Override
    public void setSalario(double salario){
        super.setSalario(salario);
    }
    @Override
    public void setNome(String nome){
        super.setNome(nome);
    }
    @Override
    public void setSobrenome(String sobrenome){
        super.setSobrenome(sobrenome);
    }
    @Override
    public int getMatricula(){
        return super.getMatricula();
    }
    @Override
    public double getSalario(){
        return super.getSalario();
    }
    @Override
    public String nomeCompleto(){
        return super.nomeCompleto();
    }
    @Override
    public double getSalarioPrimeiraPrestacao(){
        return getSalario()+getSalario()*60/100;
    }
    
}
