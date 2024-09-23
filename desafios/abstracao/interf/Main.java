package desafios.abstracao.interf;

public class Main {
    public static void main(String[] args) {
        Operavel carro = new Carro();
        Operavel aviao = new Aviao();
        Operavel barco = new Barco();
        // Crie uma instância da sua nova classe aqui
        // Exemplo: Operavel bicicleta = new Bicicleta();

        Operavel[] veiculos = {carro, aviao, barco /*, bicicleta */};

        for (Operavel veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
            veiculo.desligar();
            System.out.println("---------------------");
        }
    }
}
