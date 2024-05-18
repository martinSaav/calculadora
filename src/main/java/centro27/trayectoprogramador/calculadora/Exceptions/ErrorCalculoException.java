package centro27.trayectoprogramador.calculadora.Exceptions;

public class ErrorCalculoException extends ArithmeticException {
    public ErrorCalculoException() {
        super("Hubo un error en el cálculo");
    }
}
