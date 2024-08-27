public class BreakExemploFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Encerra o loop quando i é igual a 5
            }
            System.out.println("Valor de i: " + i);
        }
    }
}
