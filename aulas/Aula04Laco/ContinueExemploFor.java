public class ContinueExemploFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Pula a iteração se i for par
            }
            System.out.println("Valor de i: " + i);
        }        
    }
}
