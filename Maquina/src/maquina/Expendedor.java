
package maquina;

import java.util.ArrayList;
        
public class Expendedor{
    private ArrayList<Bebida> fantas;
    private ArrayList<Bebida> sprites;
    private ArrayList<Bebida> cocacolas;
    private int money;
    public Expendedor(int cant, int precio){
        money = precio;
        fantas = new ArrayList<Bebida>();
        sprites = new ArrayList<Bebida>();
        cocacolas = new ArrayList<Bebida>();
        for(int i = 0; i < cant; i++){
            fantas.add(new Fanta(100+i,precio));
            sprites.add(new Sprite(200+i,precio));
            cocacolas.add(new CocaCola(300+i,precio));
        }
    }
    
    public Moneda getVuelto(){
        
        return 0;
        
    }
    public Bebida ComprarBebida(int num, Moneda m) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException{
        Bebida drink;
        if(m.getValor()== 100 || m.getValor()==500 || m.getValor()== 1000){
            if(m.getValor() > money){
                switch (num) {
                    case 1 -> drink = cocacolas.remove(0);
                    case 2 -> drink = sprites.remove(0);
                    case 3 -> drink = fantas.remove(0);
                }
            }
        }
        return drink;
    }

    private static class NoHayBebidaException {

        public NoHayBebidaException() {
        }
    }

    private static class PagoIncorrectoException extends Exception {

        public PagoIncorrectoException() {
        }
    }

    private static class PagoInsuficienteException extends Exception {

        public PagoInsuficienteException() {
            
        }
    }
}
