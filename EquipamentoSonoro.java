/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipamentoSonoro;
import equipamento.Equipamento;
/**
 *
 * @author Madalena Makiesse
 */
public class EquipamentoSonoro extends Equipamento{
    private int volume;
    private boolean stereo;
    
    public EquipamentoSonoro(boolean ligado, int volume, boolean stereo){
        super(ligado);
        this.volume=volume;
        this.stereo=stereo;
    }
    
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume=volume;
    }
    @Override
    public void ligar(){
        super.ligar();
        setVolume(5);
    }
    @Override
    public void desligar(){
        super.desligar();
    }
    @Override
    public boolean estado(){
        return super.estado();
    }
    
}
