import java.util.Scanner;

public class ejercicio32 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese un número entero diferente de cero:");
            int N = Integer.parseInt(scanner.nextLine());

            System.out.println("Los divisores de " + N + " son:");

            for (int k = 1; k <= Math.abs(N); k++) {
                if (N % k == 0) {
                    System.out.println(k);
                }
            }

        }
    }
}
