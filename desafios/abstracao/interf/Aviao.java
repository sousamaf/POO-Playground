package desafios.abstracao.interf;

public class Aviao implements Operavel {
    @Override
    public void ligar() {
        System.out.println("O avião está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O avião está desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("O avião está decolando.");
    }
}
