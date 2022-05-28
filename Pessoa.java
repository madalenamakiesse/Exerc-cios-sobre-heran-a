/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa1;
import endereco1.Endereco;
/**
 *
 * @author Madalena Makiesse
 */
public class Pessoa {
    private String nome;
    private String sobreNome;
    private Endereco endereco;
    private int telefone;
    
    //Construtores
    public Pessoa(){
        
    }
    public Pessoa(String nome, Endereco endereco, int telefone){
        this.nome=nome;
        this.endereco=endereco;
        this.telefone=telefone;
    }
    public Pessoa(String nome, String sobreNome){
        this.nome=nome;
        this.sobreNome=sobreNome;
    }
    
    //Setters
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSobrenome(String sobreNome){
        this.sobreNome=sobreNome;
    }
    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
    }

    public void setTelefone(int telefone){
        this.telefone=telefone;
    }
    //Getters
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobreNome;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public int getTelefone(){
        return telefone;
    }
    public String nomeCompleto(){
        return getNome()+" "+getSobrenome();
    }
}
