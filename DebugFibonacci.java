package unid02_Mi_profe_el_torturador;

public class DebugFibonacci {
    public static void main(String[] args) {
        int limite = 10;
        System.out.println("=== SUCESION DE FIBONACCI ===");
        for (int i = 0; i <= limite; i++) {
            int resultado = fibonacci(i);
            System.out.println("Fibonacci de " + i + " = " + resultado);
        }
        System.out.println("\n=== ANALISIS MATEMATICO ===");
        int suma = sumarFibonacci(limite);
        System.out.println("La suma total es: " + suma);
        double media = calcularMedia(suma, limite);
        System.out.println("La media es: " + media);
        boolean esPar = comprobarPar(suma);
        System.out.println("¿La suma es par? " + esPar);
    }
    public static int fibonacci(int n) {
        // CORRECCION:
        // Fibonacci empieza con 0 y 1
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        // CORRECCION:
        // Antes era n-3 y daba errores
        // La sucesion correcta usa n-1 y n-2
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int sumarFibonacci(int limite) {
        int suma = 0;
        for (int i = 0; i < limite; i++) {
            // CORRECCION:
            // Antes se hacia:
            // suma = fibonacci(i);
            // y solo guardaba el ultimo numero
            // Ahora se van sumando todos
            suma += fibonacci(i);
        }
        return suma;
    }
    public static double calcularMedia(int suma, int cantidad) {
        // CORRECCION:
        // Se convierte a double para obtener decimales
        return (double) suma / cantidad;
    }
    public static boolean comprobarPar(int numero) {
        // CORRECCION:
        // Antes comprobaba si era impar (%2 == 1)
        // Ahora comprueba correctamente si es par
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }
}

