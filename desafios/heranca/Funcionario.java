package desafios.heranca;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void trabalhar(){
        System.out.println(nome + " está trabalhando.");
    }

    public double getSalario(){
        return salario;
    }
}
