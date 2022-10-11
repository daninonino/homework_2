package maquina;
import java.util.ArrayList;

public class Comprador {
    private int cantidadTotal;
    private String sabor;
    private ArrayList<Moneda> moneda;
    private Bebida bebida;
    
    
    public Comprador(Moneda mon, int tipoBebida, Expendedor exp){ 
        ArrayList<Moneda> moneda=new ArrayList<Moneda>();
        moneda.add(mon);
        cantidadTotal = mon.getValor();
        bebida = exp.ComprarBebida(tipoBebida, mon);
        
    }
    public int cantidadTotal(){
        return cantidadTotal;
    }
    
    public int cuantoVuelto(){
        return getVuelto();
    } 
    public String queBebiste(){
        return "gluglu: " + bebida.beber();
    }

}