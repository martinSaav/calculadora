package centro27.trayectoprogramador.calculadora;

import centro27.trayectoprogramador.calculadora.Calculadora.Calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Ejercicio
Hacer una calculadora, cuando arranque el programa tiene que aparecer el siguiente menú:
a-Sumar
b-Restar
c-Multiplicar
d-Dividir
e-Salir
  Hacer una función para cada operación, que lea los números ingresados y devuelva el resultado correspondiente.
  El menú tiene que aparecer después de cada operación hasta que el usuario elija la opción e.
* */
public class App  {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main( String[] args ) {
        String opcion = "";
        List<Double> operandos;
        while (!opcion.equals("e")) {
            mostrarMenu();
            opcion = scanner.nextLine();
            try {
                switch (opcion) {
                    case "a":
                        operandos = ingresarOperandos();
                        System.out.println("El resultado de la suma es: " + Calculadora.sumar(operandos.get(0), operandos.get(1)));
                        break;
                    case "b":
                        operandos = ingresarOperandos();
                        System.out.println("El resultado de la resta es: " + Calculadora.restar(operandos.get(0), operandos.get(1)));
                        break;
                    case "c":
                        operandos = ingresarOperandos();
                        System.out.println("El resultado de la multiplicación es: " + Calculadora.multiplicar(operandos.get(0), operandos.get(1)));
                        break;
                    case "d":
                        operandos = ingresarOperandos();
                        System.out.println("El resultado de la división es: " + Calculadora.dividir(operandos.get(0), operandos.get(1)));
                        break;
                    case "e":
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("a-Sumar\nb-Restar\nc-Multiplicar\nd-Dividir\ne-Salir");
    }

    private static List<Double> ingresarOperandos() {
        List<Double> operandos = new ArrayList<>();
        Double operando1 = 0.0;
        Double operando2 = 0.0;
        try {
            System.out.println("Ingrese el primer operando");
            operando1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Ingrese el segundo operando");
            operando2 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un número válido!");
            operandos = ingresarOperandos();
        }
        operandos.add(operando1);
        operandos.add(operando2);
        return operandos;
    }
}
