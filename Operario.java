/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operario;
import empregado1.Empregado;
import endereco1.Endereco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madalena Makiesse
 */
public class Operario extends Empregado{
    private double valorProducao;
    private int comissao;
    
    //Construtor
    public Operario(String nome, Endereco endereco, int telefone, String codigoSetor, double salarioBase, int imposto, double valorProducao, int comissao){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.comissao=comissao;
        this.valorProducao=valorProducao;
    }
    //Setters
    public void setComissao(int comissao){
        this.comissao=comissao;
    }
    public void setValorProducao(int valorProducao){
        this.valorProducao=valorProducao;
    }
    @Override
    public void setCodigoSetor( String codigoSetor){
        super.setCodigoSetor(codigoSetor);
    }
    @Override
    public void setSalarioBase(double salarioBase){
        super.setSalarioBase(salarioBase);
    }
    @Override
    public void setImposto(int imposto){
        super.setImposto(imposto);
    }
    @Override
    public void setNome(String nome){
        super.setNome(nome);
    }
    @Override
    public void setTelefone(int telefone){
        super.setTelefone(telefone);
    }
    @Override
    public void setEndereco(Endereco endereco){
        super.setEndereco(endereco);
    }
    //Getters
    public int getComissao(){
        return comissao;
    }
    public double getValorProducao(){
        return valorProducao;
    }
    @Override
    public String getCodigoSetor(){
        return super.getCodigoSetor();
    }
    @Override
    public double getSalarioBase(){
        return super.getSalarioBase();
    }
    @Override
    public int getImposto(){
        return super.getImposto();
    }
    @Override
    public String getNome(){
        return super.getNome();
    }
    @Override
    public int getTelefone(){
        return super.getTelefone();
    }
    @Override
    public Endereco getEndereco(){
        return super.getEndereco();
    }
    @Override
    public double calcularSalario(){
        return getSalarioBase()-(getSalarioBase()*getImposto()/100)+getSalarioBase()*getComissao()/100;
    }
    @Override
    public String toString(){
        return getNome()+", "+getEndereco().toString()+", "+getTelefone()+", "+getCodigoSetor()+", "+getComissao()+", "+getValorProducao();
    }
}

