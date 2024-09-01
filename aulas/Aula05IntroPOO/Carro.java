package aulas.Aula05IntroPOO;

// Definição da classe Carro
public class Carro {
    // Atributos da classe Carro
    private String cor;
    private String modelo;

    // Construtor para a classe Carro
    public Carro(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    // Métodos da classe Carro
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    // Métodos getters para acessar os atributos
    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }
}
