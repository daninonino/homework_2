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
        Expendedor exp=new Expendedor(2, 1000);      
        
       //Se crea 5 compradores para prbar los casos.
       //Cada comprador elige que bebida quiere elegir del expendedor, y este recibe su moneda
       //atraves de esta accion tambien bebe la bebida y guardamos el sabor en una variable
        Comprador comprador1=new Comprador(mon1500, 3, exp);
        
        //Cuestionamos al comprador1 sobre el sabor de su bebida y su vuelto recibido
        System.out.println("Que bebiste: "+comprador1.queBebiste());
        System.out.println("Vuelto: "+comprador1.cuantoVuelto()+"\n");
        
        Comprador comprador2=new Comprador(mon500, 1, exp);
        
        //Cuestionamos al comprador2 sobre el sabor de su bebida y su vuelto recibido
        System.out.println("Que bebiste: "+comprador2.queBebiste());
        System.out.println("Vuelto: "+comprador2.cuantoVuelto()+"\n");
        
        Comprador comprador3=new Comprador(null, 2, exp);
        
        //Cuestionamos al comprador3 sobre el sabor de su bebida y su vuelto recibido
        System.out.println("Que bebiste: "+comprador3.queBebiste());
        System.out.println("Vuelto: "+comprador3.cuantoVuelto()+"\n");
        
        Comprador comprador4=new Comprador(mon1000, 3, exp);
        
        //Cuestionamos al comprador4 sobre el sabor de su bebida y su vuelto recibido
        System.out.println("Que bebiste: "+comprador4.queBebiste());
        System.out.println("Vuelto: "+comprador4.cuantoVuelto()+"\n");
        
        Comprador comprador5=new Comprador(mon1500, 3, exp);
        
        //Cuestionamos al comprador5 sobre el sabor de su bebida y su vuelto recibido
        System.out.println("Que bebiste: "+comprador5.queBebiste());
        System.out.println("Vuelto: "+comprador5.cuantoVuelto()+"\n");
    
    }
    
}
