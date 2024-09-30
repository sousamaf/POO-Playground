package projetos.SuperMarketManager;

public class Bebida extends Produto {
    private boolean alcoolico;

    public Bebida(String nome, double preco, boolean alcoolico) {
        super(nome, preco);
        this.alcoolico = alcoolico;
    }
    
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Bebida alcoolica: " + ((this.alcoolico ? "Sim" : "Não" )));
    }
}
