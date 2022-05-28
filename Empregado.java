/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado1;
import pessoa1.Pessoa;
import endereco1.Endereco;
/**
 *
 * @author Madalena Makiesse
 */
public class Empregado extends Pessoa {
    private String codigoSetor;
    private double salarioBase;
    private int imposto;
    
    //Construtor
    public Empregado(String nome, Endereco endereco, int telefone, String codigoSetor, double salarioBase, int imposto){
        super(nome, endereco, telefone);
        this.codigoSetor=codigoSetor;
        this.imposto=imposto;
        this.salarioBase=salarioBase;
    }
    
    //Setters
    public void setCodigoSetor( String codigoSetor){
        this.codigoSetor=codigoSetor;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
    }
    public void setImposto(int imposto){
        this.imposto=imposto;
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
    public String getCodigoSetor(){
        return codigoSetor;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public int getImposto(){
        return imposto;
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
    public double calcularSalario(){
        return getSalarioBase()-(getSalarioBase()*getImposto()/100);
    }
    @Override
    public String toString(){
        return getNome()+", "+getEndereco().toString()+", "+getTelefone()+", "+getCodigoSetor()+", "+getSalarioBase()+", "+getImposto();
    }
}
