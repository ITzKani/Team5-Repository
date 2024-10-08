import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Por favor, ingresa el primer número: ");
        int numero1 = sc.nextInt();

        // Solicitar el segundo número
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = sc.nextInt();

        // Calcular la resta
        int resta = numero1 - numero2;

        // Imprimir la resta
        System.out.println("La resta de los numeros es " + resta);

    }
}
