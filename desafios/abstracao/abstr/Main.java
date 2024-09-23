package desafios.abstracao.abstr;

public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo("Vermelho", 5);
        Forma retangulo = new Retangulo("Azul", 4, 6);
        Forma triangulo = new Triangulo("Verde", 4, 7);
        // Crie uma instância da sua nova classe aqui
        // Exemplo: Forma quadrado = new Quadrado("Amarelo", 4);

        Forma[] formas = {circulo, retangulo, triangulo /*, quadrado */};

        for (Forma forma : formas) {
            System.out.println("A área do " + forma.getClass().getSimpleName() + " é: " + forma.calcularArea());
        }
    }
}
