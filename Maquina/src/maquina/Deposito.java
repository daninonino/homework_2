
package maquina;

import java.util.ArrayList;


public class Deposito{
    private ArrayList<Bebida> v;
    private ArrayList<Moneda> m;
    public Deposito(){
        v = new ArrayList<Bebida>();
        m = new ArrayList<Moneda>();
    }
    public Bebida getBebida(){
        if(v.isEmpty()){
            return null;
        }else{
            Bebida b = v.remove(0);
            return b;
        }
    }
    public void addBebida(Bebida drink){
        v.add(drink);
    }
    public Moneda getMoneda(){
        if(m.isEmpty()){
            return null;
        }else{
            Moneda mon = m.remove(0);
            return mon;
            }
        
        }
    
    public void addMoneda(Moneda mon){
        m.add(mon);
    }
}
