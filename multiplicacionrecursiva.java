public class MultiplicacionRecursiva {


    public static int multiplicar(int a, int b) {

        if (b == 0) {
            return 0;
        }
        if (b < 0) {
            return -multiplicar(a, -b);
        }

        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int resultado = multiplicar(a, b);
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + resultado);
    }
}
