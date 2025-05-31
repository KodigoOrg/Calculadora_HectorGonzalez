import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    private static Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();

            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> ejecutarOperacion("sumar");
                    case 2 -> ejecutarOperacion("restar");
                    case 3 -> ejecutarOperacion("multiplicar");
                    case 4 -> ejecutarOperacion("dividir");
                    case 5 -> ejecutarOperacion("potencia");
                    case 6 -> ejecutarOperacion("raiz");
                    case 7 -> {
                        salir = true;
                        System.out.println("Gracias por usar esta calculadora vuelva pronto :).");
                    }
                    default -> System.out.println("escoja una de las 7 opciones por que no hay mas de 8 -_-");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
                scanner.next(); // limpiar buffer
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\n=== MENÚ DE CALCULADORA ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Divicion");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz cuadrada");
        System.out.println("7. Salir de la calculadora");
        System.out.print("seleccione alguna de las opciones porfavor :) ");
    }

    private Numero pedirNumero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Debe ser un número.");
            scanner.next();
            System.out.print(mensaje);
        }
        return new Numero(scanner.nextDouble());
    }

    private void ejecutarOperacion(String tipo) {
        try {
            Numero a = null, b = null;
            double resultado = 0;

            if (tipo.equals("raiz")) {
                a = pedirNumero("Ingrese el número: ");
                resultado = Operacion.raizCuadrada(a);
            } else {
                a = pedirNumero("Ingrese el primer número: ");
                b = pedirNumero("Ingrese el segundo número: ");
                

                resultado = switch (tipo) {
                    case "sumar" -> Operacion.sumar(a, b);
                    case "restar" -> Operacion.restar(a, b);
                    case "multiplicar" -> Operacion.multiplicar(a, b);
                    case "dividir" -> Operacion.dividir(a, b);
                    case "potencia" -> Operacion.potencia(a, b);
                    default -> 0;
                };
            }

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
