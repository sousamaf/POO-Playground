package desafios.heranca;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public double getSalario(){
        return super.getSalario() + bonus;
    }

    public void gerenciar(){
        System.out.println(nome + " está gerenciando a equipe.");
    }
}
