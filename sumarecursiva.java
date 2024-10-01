public class SumaRecursiva {
public static int suma(n){
  if (n < 0) {
            return 0;
        }
        
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        int numero = 5; 
        int resultado = suma(numero);
        System.out.println("La suma de los números desde 1 hasta " + numero + " es: " + resultado);
    }
}

