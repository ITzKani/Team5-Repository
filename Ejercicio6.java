import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Por favor, ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        // Solicitar el segundo número
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Calcular la multiplicación
        int multiplicacion = numero1 * numero2;

        // Imprimir la multiplicación
        System.out.println("La multiplicación de los numeros es "+ multiplicacion);

    }
}
