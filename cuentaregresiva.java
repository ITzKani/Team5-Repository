import java.util.Scanner;

public class CuentaRegresiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de inicio de la cuenta regresiva: ");
        int inicio = scanner.nextInt();

       cuentaRegresiva(inicio);

        scanner.close();
    }

    public static void cuentaRegresiva(int numero) {
        if (numero < 0) {
            System.out.println("Termino la cuenta regresiva");
            return;
        }

        System.out.println(numero);
        cuentaRegresiva(numero - 1);
    }
}
