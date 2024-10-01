import java.util.Scanner;

public class SumaSucesiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        int resultado = sumaSucesiva(numero);
        System.out.println("La suma sucesiva de " + numero + " es: " + resultado);

        scanner.close();
    }

    public static int sumaSucesiva(int n) {

        if (n <= 0) {
            return 0;
        }

        return n + sumaSucesiva(n - 1);
    }
}
