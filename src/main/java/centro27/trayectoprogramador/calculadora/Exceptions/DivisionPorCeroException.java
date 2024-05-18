package centro27.trayectoprogramador.calculadora.Exceptions;

public class DivisionPorCeroException extends ArithmeticException {
    public DivisionPorCeroException() {
        super("No se puede dividir por cero");
    }
}



