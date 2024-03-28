import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        // Criando um Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que informe a string
        System.out.print("Digite a string a ser invertida: ");
        String original = scanner.nextLine();

        // Invertendo a string
        String invertida = inverterString(original);

        // Exibindo a string invertida
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);

        // Fechando o Scanner
        scanner.close();
    }

    // Método para inverter a string sem usar reverse
    public static String inverterString(String str) {
        // Convertendo a string em um array de caracteres
        char[] chars = str.toCharArray();

        // Invertendo os caracteres no array manualmente
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        // Convertendo o array de volta para uma string
        return new String(chars);
    }
}
