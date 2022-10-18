
package maquina;


public abstract class Moneda {
    private DepVuelto dep;
    
    public Moneda(){}
    
    public Moneda getSerie(){
        Moneda serie=dep.getMoneda();
        return serie;
    }
    
    public abstract int getValor();
    
    public String toString(){
        return "Serie de Moneda: "+ getSerie();
    }
    
}

class Moneda1500 extends Moneda {
    public Moneda1500(){}
    
    public Moneda getSerie(Moneda serie){
        return serie;
    }    

    @Override
    public int getValor() {
        return 1500;
    }
}
class Moneda1000 extends Moneda {
    public Moneda1000(){}
    
    @Override
    public int getValor() {
        return 1000;
    }
}
class Moneda500 extends Moneda {
    public Moneda500(){}
    
    @Override
    public int getValor() {
        return 500;
    }
}
class Moneda100 extends Moneda {
    public Moneda100(){}
    
    @Override
    public int getValor() {
        return 100;
    }
}