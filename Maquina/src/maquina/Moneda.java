
package maquina;


public class Moneda {
    public Moneda getSerie(){}
    abstract int getValor();
}

class Moneda1500 extends Moneda {
    public Moneda1500(){
        
    }
    
}
class Moneda1000 extends Moneda {}
class Moneda500 extends Moneda {}
class Moneda100 extends Moneda {}
