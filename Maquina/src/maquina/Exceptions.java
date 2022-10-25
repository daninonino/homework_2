
package maquina;


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
