/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;
import empregado1.Empregado;
import endereco1.Endereco;
/**
 *
 * @author Madalena Makiesse
 */
public class Administrador extends Empregado{
    private double ajudaDeCusto;
    
    //Construtor
    public Administrador(String nome, Endereco endereco, int telefone, String codigoSetor, double salarioBase, int imposto, double ajudaDeCusto){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto=ajudaDeCusto;
    }
    //Setters
    public void setAjudaDeCusto(){
        this.ajudaDeCusto=ajudaDeCusto;
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
    public double getAjudaDeCusto(){
        return ajudaDeCusto;
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
        return getSalarioBase()-(getSalarioBase()*getImposto()/100)+ajudaDeCusto;
    }
    @Override
    public String toString(){
        return getNome()+", "+getEndereco().toString()+", "+getTelefone()+", "+getCodigoSetor()+", "+getSalarioBase()+", "+getImposto()+", "+getAjudaDeCusto();
    }
}
