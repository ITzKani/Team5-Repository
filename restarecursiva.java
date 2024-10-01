public class RestaRecursiva {

    public static int resta(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + resta(n - 1);
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = resta(numero);
        System.out.println("La suma de los números desde " + numero + " hasta 1 es: " + resultado);
    }
}
