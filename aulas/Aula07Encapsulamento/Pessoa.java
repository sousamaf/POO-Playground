package aulas.Aula07Encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;
    private int peso;
    private float altura;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade > 0)
            this.idade = idade;
        else
            System.out.println("A idade precisa ser superior a 0.");
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    // getters and setters
    
}
