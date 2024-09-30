package projetos.SuperMarketManager;

public class Perecivel extends Produto {
    private int diasValidade;

    public Perecivel(String nome, double preco, int diasValidade) {
        super(nome, preco);
        this.diasValidade = diasValidade;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Dias de validade: " + this.diasValidade);
    }
}
