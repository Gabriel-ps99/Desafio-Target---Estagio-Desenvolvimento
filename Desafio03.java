public class Desafio03 {
    public static void main(String[] args) {
        // Sequência a) 1, 3, 5, 7, ___
        int proximoA = proximoElementoSequenciaA(7);
        System.out.println("Próximo elemento da sequência a): " + proximoA);

        // Sequência b) 2, 4, 8, 16, 32, 64, ____
        int proximoB = proximoElementoSequenciaB(64);
        System.out.println("Próximo elemento da sequência b): " + proximoB);

        // Sequência c) 0, 1, 4, 9, 16, 25, 36, ____
        int proximoC = proximoElementoSequenciaC(36);
        System.out.println("Próximo elemento da sequência c): " + proximoC);

        // Sequência d) 4, 16, 36, 64, ____
        int proximoD = proximoElementoSequenciaD(64);
        System.out.println("Próximo elemento da sequência d): " + proximoD);

        // Sequência e) 1, 1, 2, 3, 5, 8, ____
        int proximoE = proximoElementoSequenciaE(8);
        System.out.println("Próximo elemento da sequência e): " + proximoE);

        // Sequência f) 2, 10, 12, 16, 17, 18, 19, ____
        int proximoF = proximoElementoSequenciaF(19);
        System.out.println("Próximo elemento da sequência f): " + proximoF);
    }

    // Função para encontrar o próximo elemento da sequência a)
    public static int proximoElementoSequenciaA(int ultimoElemento) {
        return ultimoElemento + 2;
    }

    // Função para encontrar o próximo elemento da sequência b)
    public static int proximoElementoSequenciaB(int ultimoElemento) {
        return ultimoElemento * 2;
    }

    // Função para encontrar o próximo elemento da sequência c)
    public static int proximoElementoSequenciaC(int ultimoElemento) {
        return ultimoElemento + 11; // Soma do próximo número ímpar
    }

    // Função para encontrar o próximo elemento da sequência d)
    public static int proximoElementoSequenciaD(int ultimoElemento) {
        return (int) Math.pow(Math.sqrt(ultimoElemento) + 2, 2);
    }

    // Função para encontrar o próximo elemento da sequência e)
    public static int proximoElementoSequenciaE(int ultimoElemento) {
        // Sequência de Fibonacci
        int anterior1 = 5; // Penúltimo número
        int anterior2 = 8; // Último número
        return anterior1 + anterior2;
    }

    // Função para encontrar o próximo elemento da sequência f)
    public static int proximoElementoSequenciaF(int ultimoElemento) {
        return 200; // Seguindo a lógica da letra inicial de cada número
    }
}
