
package maquina;


abstract class Bebida {
    private int serie;
    private int precio;
    public Bebida(int s, int p){
        serie = s;
        precio = p;
        
    }
    public abstract String beber();
    public int getSerie(){
        return serie;
    }
    public int getPrecio(){
        return precio;
    }
}

class CocaCola extends Bebida{
    public CocaCola(int s, int p) {
       super(s,p);
    }
    public String beber(){
        return "Coca Cola";
    
    }
}
class Sprite extends Bebida{
    public Sprite(int s, int p) {
       super(s,p);
    }
    public String beber(){
        return "Sprite";
    }
}

class Fanta extends Bebida{
    public Fanta(int s, int p) {
       super(s,p);
    }
    public String beber(){
        return "Fanta";
    }
}