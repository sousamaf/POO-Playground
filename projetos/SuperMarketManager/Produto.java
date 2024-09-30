package projetos.SuperMarketManager;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + this.nome + " | Preço: R$ " + this.preco);
    }
}
