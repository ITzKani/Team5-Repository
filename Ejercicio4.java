import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Por favor, ingresa el primer número: ");
        int numero1 = sc.nextInt();

        // Solicitar el segundo número
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = sc.nextInt();

        // Calcular la suma
        int suma = numero1 + numero2;

        // Imprimir la suma
        System.out.println("La suma delos nunmeros es" + suma);

    }
}
