package maquina;

import java.util.ArrayList;

public class Maquina {

    public static void main(String[] args) throws PagoInsuficienteException, PagoIncorrectoException, NoHayBebidaException {    
        //Se crean monedas
        Moneda100 mon100=new Moneda100();
        Moneda500 mon500=new Moneda500();
        Moneda1000 mon1000=new Moneda1000();
        Moneda1500 mon1500=new Moneda1500();
        
        //Se crea un expendedor
        Expendedor exp=new Expendedor(50, 1000);      
        
       //Se crea un comprador
        Comprador comprador=new Comprador(mon1500, 1, exp);
        
        //El comprador elige que bebida quiere elegir del expendedor, y este recibe su moneda
        //atraves de esta accion tambien bebe la bebida y guardamos el sabor en una variable
        exp.ComprarBebida(2, mon1500);
        
        //Cuestionamos al comprador sobre el sabor de su bebida y su vuelto recibido
        System.out.println(comprador.queBebiste());
        System.out.println(comprador.cuantoVuelto());
    
    }
    
}
