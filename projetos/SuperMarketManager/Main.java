package projetos.SuperMarketManager;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto("Chaveiro", 3.55);
        Perecivel p2 = new Perecivel("Uva", 12.30, 6);
        Bebida p3 = new Bebida("Cerveja", 4.89, true);

        Produto[] produtos = {p1, p2, p3};
        
        for(Produto produto : produtos) {
            produto.mostrarDetalhes();
            System.out.println();
        }
    }
}
