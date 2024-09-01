package aulas.Aula05IntroPOO;

public class MeuCarro {
    public static void main(String[] args) {
        // Criação de uma instância da classe Carro
        Carro meuCarro = new Carro("vermelho", "sedan");

        // Acesso aos métodos da instância meuCarro
        System.out.println("Cor do carro: " + meuCarro.getCor());
        System.out.println("Modelo do carro: " + meuCarro.getModelo());
        meuCarro.acelerar();
        meuCarro.frear();
    }
}
