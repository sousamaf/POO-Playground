package projetos.supermercado;

public class Alimento extends Produto{
    private String dataValidade;
    private boolean cestaBasica;

    public Alimento(String nome, double preco, String dataValidade, boolean cestaBasica) {
        super(nome, preco);
        this.dataValidade = dataValidade;
        this.cestaBasica = cestaBasica;
    }

    public String getDataValidade() {
        return dataValidade;
    }
    
    // Implementação do método abstrato calcularImposto
    // Trata-se apenas de uma simplificação, não é uma
    // implementação real de imposto. Jamais caberia
    // em uma linha.
    @Override
    public double calcularImposto() {
        return this.getPreco() * (this.cestaBasica ? 0.08 : 0.35);
    }
}
