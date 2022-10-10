
package maquina;


abstract class Bebida {
    private int serie;
    private int precio;
    private String tipo;
    public Bebida(int s, int p, String name){
        serie = s;
        precio = p;
        tipo = name;
    }
    public String beber(){
        return tipo;
    }
    public int getSerie(){
        return serie;
    }
    public int getPrecio(){
        return precio;
    }
}

class CocaCola extends Bebida{
    public CocaCola(int s, int p) {
       super(s,p, "CocaCola");
    }
    public String
}
class Sprite extends Bebida{
    public Sprite(int s, int p) {
       super(s,p, "Sprite");
    }
}

class Fanta extends Bebida{
    public Fanta(int s, int p) {
       super(s,p, "Fanta");
    }
}
