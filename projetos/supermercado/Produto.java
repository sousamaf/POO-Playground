package projetos.supermercado;

// Classe abstrata para produtos gerais do supermercado
// Aulas: Abstração teórica e prática
public abstract class Produto implements Vendavel {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Implementação dos métodos da interface vendavel
    public double getPreco(){
        return preco;
    }

    public String getDescricao(){
        return nome;
    }

    // Método abstrato para calcular o imposto sobre o produto
    public abstract double calcularImposto();
}
