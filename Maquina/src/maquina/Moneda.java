
package maquina;


abstract public class Moneda {
    private Moneda serie;
    private int valor;
    
    public Moneda(Moneda serie){
        this.serie=serie;
    }
    
    public Moneda getSerie(){
        return serie;
    }
    public abstract int getValor();
    
}

class Moneda1500 extends Moneda {
    public Moneda1500(Moneda serie){
        super(serie);
    }

    public int getValor() {
        return 1500;
    }
}
class Moneda1000 extends Moneda {
    public Moneda1000(Moneda serie){
        super(serie);
    }
    
    public int getValor() {
        return 1000;
    }
}
class Moneda500 extends Moneda {
    public Moneda500(Moneda serie){
        super(serie);
    }
    
    public int getValor() {
        return 500;
    }
}
class Moneda100 extends Moneda {
    public Moneda100(Moneda serie){
        super(serie);
    }
    
    public int getValor() {
        return 100;
    }
}