/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endereco1;

/**
 *
 * @author Madalena Makiesse
 */
public class Endereco {
    private String casa;
    private String bairro;
    private String rua;
    
    public Endereco(String casa, String bairro, String rua){
        this.bairro=bairro;
        this.casa=casa;
        this.rua=rua;
    }
    @Override
    public String toString(){
        return "Bairro:"+bairro+" Casa: "+casa+" Rua: "+rua;
    }
}
