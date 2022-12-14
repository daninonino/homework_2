package maquina;

public class Comprador {
    private int cantidadTotal;
    private String sabor;

    public Comprador(Moneda mon, int tipoBebida, Expendedor exp){ 
        Bebida bebida;
        sabor = null;
        try{
            bebida = exp.ComprarBebida(tipoBebida, mon);
            sabor = bebida.beber();
        }catch (PagoIncorrectoException | NoHayBebidaException | PagoInsuficienteException e){
            System.out.println(e.getMessage());
        }finally{
            Moneda d;
            do{
                d = exp.getVuelto();
                if(d != null)
                {
                    cantidadTotal += d.getValor();
                }
            }while(d != null);
        }
        
    }
    
    public int cuantoVuelto(){
        return cantidadTotal;
    } 
    public String queBebiste(){
        return  sabor;
    }

}