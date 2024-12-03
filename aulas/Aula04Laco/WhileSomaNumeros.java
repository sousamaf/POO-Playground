import java.util.Scanner;

public class WhileSomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite números positivos para somar (ou um número negativo para sair):");

        while (true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                break; // Encerra o loop se o número for negativo
            }
            soma += numero;
            // soma = soma + numero;
        }
        scanner.close();
        System.out.println("A soma dos números é: " + soma);
    }
}
