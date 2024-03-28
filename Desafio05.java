import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();

        String reversedString = inverterString(inputString);
        System.out.println("String invertida: " + reversedString);

        scanner.close();
    }

    public static String inverterString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }
}
