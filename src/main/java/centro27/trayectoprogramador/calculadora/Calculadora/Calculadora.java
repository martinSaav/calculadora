package centro27.trayectoprogramador.calculadora.Calculadora;

import centro27.trayectoprogramador.calculadora.Exceptions.DivisionPorCeroException;
import centro27.trayectoprogramador.calculadora.Exceptions.ErrorCalculoException;

public class Calculadora {

    public Calculadora() {
    }

    public static Double sumar(Double operando1, Double operando2) {
        Double resultado = operando1 + operando2;
        verificarErrorCalculo(resultado);
        return normalizarCero(resultado);
    }

    public static Double restar(Double operando1, Double operando2) {
        Double resultado = operando1 - operando2;
        verificarErrorCalculo(resultado);
        return normalizarCero(resultado);
    }

    public static Double multiplicar(Double operando1, Double operando2) {
        Double resultado = operando1 * operando2;
        verificarErrorCalculo(resultado);
        return normalizarCero(resultado);
    }

    public static Double dividir(Double operando1, Double operando2) {
        if (operando2 == 0) {
            throw new DivisionPorCeroException();
        }
        Double resultado = operando1 / operando2;
        verificarErrorCalculo(resultado);
        return normalizarCero(resultado);
    }

    private static Double normalizarCero(Double value) {
        return value == -0.0 ? 0.0 : value;
    }

    private static void verificarErrorCalculo(Double resultado) {
        if (resultado.isInfinite()) {
            throw new ErrorCalculoException();
        }
    }
}
