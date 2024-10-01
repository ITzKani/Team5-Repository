public class DivisionRecursiva {


    public static int dividir(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }

        if (a < b) {
            return 0;
        }

        return 1 + dividir(a - b, b);
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 4;
        try {
            int resultado = dividir(a, b);
            System.out.println("La división de " + a + " entre " + b + " es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
