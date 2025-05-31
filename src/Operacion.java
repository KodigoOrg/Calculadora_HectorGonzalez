public class Operacion {
    public static double sumar(Numero a, Numero b) {
        return a.getValor() + b.getValor();
    }

    public static double restar(Numero a, Numero b) {
        return a.getValor() - b.getValor();
    }

    public static double multiplicar(Numero a, Numero b) {
        return a.getValor() * b.getValor();
    }

    public static double dividir(Numero a, Numero b) throws ArithmeticException {
        if (b.getValor() == 0) {
            throw new ArithmeticException("Error: División por cero.");
        }
        return a.getValor() / b.getValor();
    }

    public static double potencia(Numero base, Numero exponente) {
        return Math.pow(base.getValor(), exponente.getValor());
    }

    public static double raizCuadrada(Numero numero) throws ArithmeticException {
        if (numero.getValor() < 0) {
            throw new ArithmeticException("Error: Raíz cuadrada de número negativo.");
        }
        return Math.sqrt(numero.getValor());
    }
}

