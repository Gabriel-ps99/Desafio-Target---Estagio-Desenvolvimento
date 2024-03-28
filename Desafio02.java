import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numberToCheck = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c;

        while (a <= numberToCheck) {
            if (a == numberToCheck) {
                System.out.println("\nO número informado pertence à sequência de Fibonacci.");
                scanner.close();
                return;
            }
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("\nO número informado NÃO pertence à sequência de Fibonacci.");
        scanner.close();
    }
}
