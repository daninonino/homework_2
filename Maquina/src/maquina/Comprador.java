package maquina;
import java.util.ArrayList;

public class Comprador {
    private int cantidadTotal;
    private String sabor;
    private ArrayList<Moneda> moneda;
    private Bebida bebida;
    
    
    public Comprador(Moneda mon, int tipoBebida, Expendedor exp) throws PagoInsuficienteException, PagoIncorrectoException, NoHayBebidaException{ 
        ArrayList<Moneda> moneda = new ArrayList<Moneda>();
        cantidadTotal = mon.getValor();
        try{
            bebida = exp.ComprarBebida(tipoBebida, mon);
            sabor = bebida.beber();
        }catch (PagoIncorrectoException | NoHayBebidaException | PagoInsuficienteException e){
            System.out.println(e);
        }finally{
            Moneda d = null;
            do{
                d = exp.getVuelto();
                if(d != null) moneda.add(d);
            }while(d != null);
        }
        
    }
    public int cantidadTotal(){
        return cantidadTotal;
    }
    
    public int cuantoVuelto(){
        return moneda.size();
    } 
    public String queBebiste(){
        return "gluglu: " + bebida.beber();
    }

}