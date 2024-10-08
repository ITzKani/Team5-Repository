import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el primer número
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        // Pedir al usuario el segundo número
        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Verificar que el segundo número no sea cero
        if (numero2 != 0) {
            // Calcular la división
            double division = numero1/numero2;

            // Imprimir el resultado
            System.out.println("La división de los dos números es: " + division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

    }
}
