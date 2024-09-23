package desafios.abstracao.interf;

public class Barco implements Operavel {
    @Override
    public void ligar() {
        System.out.println("O barco está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O barco está desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("O barco está navegando.");
    }
}
