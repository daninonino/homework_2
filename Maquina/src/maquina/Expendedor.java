
package maquina;

import java.util.ArrayList;
        
public class Expendedor{
    private Deposito fantas;
    private Deposito sprites;
    private Deposito cocacolas;
    private int money;
    private ArrayList<Moneda> coin;
    public Expendedor(int cant, int precio){
        this.coin = null;
        money = precio;
        fantas = new Deposito();
        sprites = new Deposito();
        cocacolas = new Deposito();
        for(int i = 0; i < cant; i++){
            fantas.addBebida(new Fanta(100+i,precio));
            sprites.addBebida(new Sprite(200+i,precio));
            cocacolas.addBebida(new CocaCola(300+i,precio));
        }
    }
    
    public Moneda getVuelto(){
        if(coin.isEmpty()){
            return null;
        }else{
            return coin.remove(0);
        }
    }
    
    public Bebida ComprarBebida(int num, Moneda m) throws PagoInsuficienteException, PagoIncorrectoException, NoHayBebidaException{
        Bebida drink = null;
        String tipoBebida = null;
        if(m != null){
            if(m.getValor() >= money){
                switch (num) {
                    case 1 -> {
                        drink = cocacolas.getBebida();
                        tipoBebida = "CocaCola";
                    }
                    case 2 -> {
                        drink = sprites.getBebida();
                        tipoBebida = "Sprite";
                    }
                    case 3 -> {
                        drink = fantas.getBebida();
                        tipoBebida = "Fanta";
                    }
                }
                if(drink != null){
                    for(int i = 0; i < (m.getValor()-money)/100;i++){
                        Moneda cien = null;
                        cien = new Moneda100(cien);
                        coin.add(cien);
                    }
                    return drink;
                }
                else if(tipoBebida != null){
                    coin.add(m);
                    throw new NoHayBebidaException("Error: No quedan "+tipoBebida+"s.");
                }
                else{
                    coin.add(m);
                    throw new NoHayBebidaException("Error: Deposito incorrecto");
                }
            } else {
                coin.add(m);
                throw new PagoInsuficienteException("Error: Pago insuficiente.");
            }  
        } else throw new PagoIncorrectoException("Error: No ha ingresado monedas.");
    }
}

class NoHayBebidaException extends Exception {
    public NoHayBebidaException(String text) {
        super(text);
    }
}

class PagoIncorrectoException extends Exception {

    public PagoIncorrectoException(String text) {
        super(text);
    }
}

class PagoInsuficienteException extends Exception {

    public PagoInsuficienteException(String text) {
        super(text);
    }
}
