/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;
import pessoa1.Pessoa;
/**
 *
 * @author Madalena Makiesse
 */
public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;
    
    public Funcionario(String nome, String sobrenome, int matricula, double salario){
        super(nome, sobrenome);
        this.matricula=matricula;
        if(salario>=0) this.salario=salario;
        else this.salario=0;
    }
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    @Override
    public void setNome(String nome){
        super.setNome(nome);
    }
    @Override
    public void setSobrenome(String sobrenome){
        super.setSobrenome(sobrenome);
    }
    public int getMatricula(){
        return matricula;
    }
    public double getSalario(){
        return salario;
    }
    @Override
    public String nomeCompleto(){
        return super.nomeCompleto();
    }
    public double getSalarioPrimeiraPrestacao(){
        return salario + salario*60/100;
    }
    public double getSalarioSegundaPrestacao(){
        return salario + salario*40/100;
    }
    
}
