package projetos.SuperMarketManager;

public class Eletronico extends Produto {
    private String garantia;

    public Eletronico(String nome, double preco, String garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Garantia: " + this.garantia);
    }

    void mostrarDetalhes(double desconto) {
        super.mostrarDetalhes();
        double comDesconto = this.preco * desconto;
        System.out.println("Desconto: " + comDesconto);
    }

}
