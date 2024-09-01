package aulas.Aula07Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Marco");
        p1.setIdade(30);

        System.out.println("Nome: " + p1.getNome() + " Idade: " + p1.getIdade());
    }
}
