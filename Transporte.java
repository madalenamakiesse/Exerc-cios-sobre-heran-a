/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte1;
import equipamento.Equipamento;
/**
 *
 * @author Madalena Makiesse
 */
public class Transporte extends Equipamento{
    private int velocidade;
    
    public Transporte(boolean ligado, int velocidade){
        super(ligado);
        this.velocidade=velocidade;
    }
    @Override
    public void ligar(){
        super.ligar();
    }
    @Override
    public void desligar(){
        super.desligar();
        this.velocidade=0;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(){
        this.velocidade=velocidade;
    }
}
