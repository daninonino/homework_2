
package maquina;

import java.util.ArrayList;


public class Deposito{
    private ArrayList<Bebida> v;
    
    public Deposito(int cant){
        v = new ArrayList<>(cant);

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
}
