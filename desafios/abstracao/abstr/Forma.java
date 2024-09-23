package desafios.abstracao.abstr;

public abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    // Método abstrato para calcular a área
    public abstract double calcularArea();

    public String getCor() {
        return cor;
    }
}
