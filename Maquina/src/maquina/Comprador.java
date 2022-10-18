package maquina;
import java.util.ArrayList;

public class Comprador {
    private int cantidadTotal;
    private String sabor;
    private ArrayList<Moneda> moneda;
    private Bebida bebida;
    
    public Comprador(Moneda mon, int tipoBebida, Expendedor exp) throws PagoInsuficienteException, PagoIncorrectoException, NoHayBebidaException{ 
        moneda = new ArrayList<>();
        sabor = null;
        try{
            bebida = exp.ComprarBebida(tipoBebida, mon);
            sabor = bebida.beber();
        }catch (PagoIncorrectoException | NoHayBebidaException | PagoInsuficienteException e){
            System.out.println(e);
        }finally{
            Moneda d;
            do{
                d = exp.getVuelto();
                if(d != null) moneda.add(d);
            }while(d != null);
            cantidadTotal = moneda.size();
        }
        
    }
    
    public int cuantoVuelto(){
        return cantidadTotal;
    } 
    public String queBebiste(){
        return  sabor;
    }

}