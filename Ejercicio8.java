import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el primer número
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        // Pedir al usuario el segundo número
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        // Verificar que el segundo número no sea cero
        if (numero2 != 0) {
            // Calcular el módulo
            int modulo = numero1 % numero2;

            // Imprimir el resultado
            System.out.println("El módulo de los dos números es: " + modulo);
        } else {
            System.out.println(" No se puede calcular el módulo con un divisor de cero.");
        }

     }
}
