import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Imprimir el mensaje de bienvenida
        System.out.println("Bienvenido " + nombre);

        scanner.close();
    }
}
