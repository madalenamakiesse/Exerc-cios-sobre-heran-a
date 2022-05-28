/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornecedor1;
import endereco1.Endereco;
import pessoa1.Pessoa;
/**
 *
 * @author Madalena Makiesse
 */
public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;
    
    //Construtores
    public Fornecedor(String nome, Endereco endereco, int telefone, double valorCredito, double valorDivida){
        super(nome, endereco, telefone);
        this.valorCredito=valorCredito;
        this.valorDivida=valorDivida;
    }
    //Setters
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
    public void setValorCredito(double valorCredito){
        this.valorCredito=valorCredito;
    }
    public void setValorDivida(double valorDivida){
        this.valorDivida=valorDivida;
    }
    //Getters
    public double getValorCredito(){
        return valorCredito;
    }
    public double getValorDivida(){
        return valorDivida;
    }
    @Override
    public String getNome(){
        return super.getNome();
    }
    @Override
    public Endereco getEndereco(){
        return super.getEndereco();
    }
    public double obterSaldo(){
        return valorCredito - valorDivida;
    }
    @Override
    public String toString(){
        return getNome()+" "+getEndereco().toString()+" "+getTelefone()+" "+getValorCredito()+" "+getValorDivida();
    }
}
