package centro27.trayectoprogramador.calculadora.Calculadora;

import centro27.trayectoprogramador.calculadora.Exceptions.DivisionPorCeroException;
import centro27.trayectoprogramador.calculadora.Exceptions.ErrorCalculoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSumarUnoMasCeroEsIgualAUno() {
        // Arrange
        Double operando1 = 1.0;
        Double operando2 = 0.0;

        // Act
        Double resultado = Calculadora.sumar(operando1, operando2);

        // Assert
        assertEquals(1.0, resultado);
    }

    @Test
    void testSumarCeroMasUnoEsIgualAUno() {
        Double operando1 = 0.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.sumar(operando1, operando2);

        assertEquals(1.0, resultado);
    }

    @Test
    void testSumarCeroMasCeroEsIgualACero() {
        Double operando1 = 0.0;
        Double operando2 = 0.0;

        Double resultado = Calculadora.sumar(operando1, operando2);

        assertEquals(0.0, resultado);
    }

    @Test
    void TestSumarUnoMasUnoEsIgualADos() {
        Double operando1 = 1.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.sumar(operando1, operando2);

        assertEquals(2.0, resultado);
    }

    @Test
    void TestSumarMenosUnoMasUnoEsIgualACero() {
        Double operando1 = -1.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.sumar(operando1, operando2);

        assertEquals(0.0, resultado);
    }

    @Test
    void TestSumarUnoMasMenosUnoEsIgualACero() {
        Double operando1 = 1.0;
        Double operando2 = -1.0;

        Double resultado = Calculadora.sumar(operando1, operando2);

        assertEquals(0.0, resultado);
    }

    @Test
    void TestSumarMenosUnoMasMenosUnoEsIgualAMenosDos() {
        Double operando1 = -1.0;
        Double operando2 = -1.0;

        Double resultado = Calculadora.sumar(operando1, operando2);

        assertEquals(-2.0, resultado);
    }

    @Test
    void testRestarUnoMenosCeroEsIgualAUno() {
        Double operando1 = 1.0;
        Double operando2 = 0.0;

        Double resultado = Calculadora.restar(operando1, operando2);

        assertEquals(1.0, resultado);
    }

    @Test
    void testRestarCeroMenosUnoEsIgualAMenosUno() {
        Double operando1 = 0.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.restar(operando1, operando2);

        assertEquals(-1.0, resultado);
    }

    @Test
    void testRestarCeroMenosCeroEsIgualACero() {
        Double operando1 = 0.0;
        Double operando2 = 0.0;

        Double resultado = Calculadora.restar(operando1, operando2);

        assertEquals(0.0, resultado);
    }

    @Test
    void testRestarUnoMenosUnoEsIgualACero() {
        Double operando1 = 1.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.restar(operando1, operando2);

        assertEquals(0.0, resultado);
    }

    @Test
    void testRestarMenosUnoMenosUnoEsIgualAMenosDos() {
        Double operando1 = -1.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.restar(operando1, operando2);

        assertEquals(-2.0, resultado);
    }

    @Test
    void testRestarUnoMenosMenosUnoEsIgualADos() {
        Double operando1 = 1.0;
        Double operando2 = -1.0;

        Double resultado = Calculadora.restar(operando1, operando2);

        assertEquals(2.0, resultado);
    }

    @Test
    void testRestarMenosUnoMenosMenosUnoEsIgualACero() {
        Double operando1 = -1.0;
        Double operando2 = -1.0;

        Double resultado = Calculadora.restar(operando1, operando2);

        assertEquals(0.0, resultado);
    }

    @Test
    void testMultiplicarUnoPorCeroEsIgualACero() {
        Double operando1 = 1.0;
        Double operando2 = 0.0;

        Double resultado = Calculadora.multiplicar(operando1, operando2);

        assertEquals(0.0, resultado);
    }

    @Test
    void testMultiplicarCeroPorUnoEsIgualACero() {
        Double operando1 = 0.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.multiplicar(operando1, operando2);

        assertEquals(0.0, resultado);
    }

    @Test
    void testMultiplicarCeroPorCeroEsIgualACero() {
        Double operando1 = 0.0;
        Double operando2 = 0.0;

        Double resultado = Calculadora.multiplicar(operando1, operando2);

        assertEquals(0.0, resultado);
    }

    @Test
    void testMultiplicarUnoPorUnoEsIgualAUno() {
        Double operando1 = 1.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.multiplicar(operando1, operando2);

        assertEquals(1.0, resultado);
    }

    @Test
    void testMultiplicarMenosUnoPorUnoEsIgualAMenosUno() {
        Double operando1 = -1.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.multiplicar(operando1, operando2);

        assertEquals(-1.0, resultado);
    }

    @Test
    void testMultiplicarUnoPorMenosUnoEsIgualAMenosUno() {
        Double operando1 = 1.0;
        Double operando2 = -1.0;

        Double resultado = Calculadora.multiplicar(operando1, operando2);

        assertEquals(-1.0, resultado);
    }

    @Test
    void testMultiplicarMenosUnoPorMenosUnoEsIgualAUno() {
        Double operando1 = -1.0;
        Double operando2 = -1.0;

        Double resultado = Calculadora.multiplicar(operando1, operando2);

        assertEquals(1.0, resultado);
    }

    @Test
    void testMultiplicarDosPorTresEsIgualASeis() {
        Double operando1 = 2.0;
        Double operando2 = 3.0;

        Double resultado = Calculadora.multiplicar(operando1, operando2);

        assertEquals(6.0, resultado);
    }

    // División

    @Test
    void testDividirUnoEntreUnoEsIgualAUno() {
        Double operando1 = 1.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.dividir(operando1, operando2);

        assertEquals(1.0, resultado);
    }

    @Test
    void testDividirCeroEntreUnoEsIgualACero() {
        Double operando1 = 0.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.dividir(operando1, operando2);

        assertEquals(0.0, resultado);
    }

    @Test
    void testDividirUnoEntreMenosUnoEsIgualAMenosUno() {
        Double operando1 = 1.0;
        Double operando2 = -1.0;

        Double resultado = Calculadora.dividir(operando1, operando2);

        assertEquals(-1.0, resultado);
    }

    @Test
    void testDividirMenosUnoEntreUnoEsIgualAMenosUno() {
        Double operando1 = -1.0;
        Double operando2 = 1.0;

        Double resultado = Calculadora.dividir(operando1, operando2);

        assertEquals(-1.0, resultado);
    }

    @Test
    void testDividirMenosUnoEntreMenosUnoEsIgualAUno() {
        Double operando1 = -1.0;
        Double operando2 = -1.0;

        Double resultado = Calculadora.dividir(operando1, operando2);

        assertEquals(1.0, resultado);
    }

    @Test
    void testDividirUnoEntreDosEsIgualA0punto5() {
        Double operando1 = 1.0;
        Double operando2 = 2.0;

        Double resultado = Calculadora.dividir(operando1, operando2);

        assertEquals(0.5, resultado);
    }

    @Test
    void testDividirCeroEntreMenosUnoEsIgualACero() {
        Double operando1 = 0.0;
        Double operando2 = -1.0;

        Double resultado = Calculadora.dividir(operando1, operando2);

        assertEquals(0.0, resultado);
    }

    @Test
    void testDividirPorCeroLanzaExcepcion() {
        Double operando1 = 1.0;
        Double operando2 = 0.0;

        assertThrows(DivisionPorCeroException.class, () -> {
            Calculadora.dividir(operando1, operando2);
        });
    }

    @Test
    void testMultiplicarResultadoInfinitoLanzaExcepcion() {
        Double operando1 = Double.MAX_VALUE;
        Double operando2 = 2.0;

        assertThrows(ErrorCalculoException.class, () -> {
            Calculadora.multiplicar(operando1, operando2);
        });
    }
}
