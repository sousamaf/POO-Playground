import java.util.Scanner;
public class DoWhileJogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 5;
        int tentativa;

        System.out.println("Digite um número entre 1 e 10:");
        do {
            tentativa = scanner.nextInt();

            if(tentativa != numeroSecreto)
                System.out.println("Você errou, tente novamente:");

        }while (tentativa != numeroSecreto);
        scanner.close();
        System.out.println("Você acertou, o número era: " + numeroSecreto);
    }
}

