/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placar;

/**
 *
 * @author ladoss
 */
public class Time {
    
    private String nome;
    private int gols;
    private int faltas;
    
    public void marcarGol(){
        this.gols++;
    }
    
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getGols(){
        return this.gols;
    }
    
    public void setGols(int gols){
        this.gols = gols;
    }
    
    public int getFaltas(){
        return this.faltas;
    }
    
    public void setFaltas(int faltas){
        this.faltas = faltas;
    
    }
}

