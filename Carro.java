/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;
import transporte1.Transporte;
/**
 *
 * @author Madalena Makiesse
 */
public class Carro extends Transporte{
    int quilometragem;
    public Carro(boolean ligado, int velocidade, int quilomentragem){
        super(ligado, velocidade);
        this.quilometragem=quilometragem;
    }
    
}
