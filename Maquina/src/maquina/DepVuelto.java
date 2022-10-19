
package maquina;

import java.util.ArrayList;

public class DepVuelto{
        private ArrayList<Moneda> m;
        
        public DepVuelto(){
            m = new ArrayList<>();
        
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
    
    public void removeMoneda(Moneda mon){
        m.remove(mon);
    
    }
    
}
