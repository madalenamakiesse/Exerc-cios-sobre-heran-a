/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipamento;

/**
 *
 * @author Madalena Makiesse
 */
public class Equipamento {
    private boolean ligado;
    
    public Equipamento(boolean ligado){
        this.ligado=ligado;
    }
    public void ligar(){
        this.ligado=true;
    }
    public void desligar(){
        this.ligado=false;
    }
    public boolean estado(){
        return ligado;
    }
}
