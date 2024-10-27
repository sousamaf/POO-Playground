package projetos.supermercado;

// Classe concreta para produtos de limpeza
public class Limpeza extends Produto {
    private boolean toxico;

    public Limpeza(String nome, double preco, boolean toxico) {
        super(nome, preco);
        this.toxico = toxico;
    }

    public boolean isToxico() {
        return toxico;
    }

    // Implementação do método abstrato calcularImposto
    // Trata-se apenas de uma simplificação, não é uma
    // implementação real de imposto. Jamais caberia
    // em uma linha.
    @Override
    public double calcularImposto() {
        return this.getPreco() * (this.toxico ? 0.42 : 0.37);
    }

   

}
