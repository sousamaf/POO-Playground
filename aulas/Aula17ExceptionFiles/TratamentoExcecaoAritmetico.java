import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecaoAritmetico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o dividendo: ");
            int dividendo = sc.nextInt();

            System.out.println("Digite o divisor: ");
            int divisor = sc.nextInt();

            float resultado = 0;

            resultado = dividendo / divisor;

            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException ie) {
            System.out.println("Digite um número inteiro.");

        } catch (ArithmeticException e) {
            System.out.println("Não se divide por zero: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
