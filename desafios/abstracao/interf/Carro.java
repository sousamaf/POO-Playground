package desafios.abstracao.interf;

public class Carro implements Operavel {
    @Override
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O carro está desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}
