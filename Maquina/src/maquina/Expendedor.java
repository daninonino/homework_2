/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquina;

import java.util.ArrayList;
        
public class Expendedor{
    ArrayList<Bebida> fantas;
    ArrayList<Bebida> sprites;
    ArrayList<Bebida> cocacolas;
    private int money;
    public Expendedor(int cant, int precio){
        money = precio;
        fantas = new ArrayList<Bebida>();
        sprites = new ArrayList<Bebida>();
        cocacolas = new ArrayList<Bebida>();
        for(int i = 0; i < cant; i++){
            fantas.add(new Fanta(100+i,precio));
            sprites.add(new Sprite(200+i,precio));
            cocacolas.add(new CocaCola(300+i,precio));
        }
    }
    
    public int getVuelto(){
        
    }
    public Bebida ComprarBebida(int i, Moneda m){
        
        if(i == 1){
              
        }
 
    }
    
}