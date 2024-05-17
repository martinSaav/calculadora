package centro27.trayectoprogramador.calculadora.Calculadora;


public class Calculadora {

    public Calculadora() {

    }
    public static double sumar(Double operando1, Double operando2) {
        return operando1 + operando2;
    }

    public static double restar(Double operando1, Double operando2) {
        return operando1 - operando2;
    }

    public static double multiplicar(Double operando1, Double operando2) {
        return operando1 * operando2;
    }

    public static double dividir(Double operando1, Double operando2) {
        if (operando2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return operando1 / operando2;
    }
}
