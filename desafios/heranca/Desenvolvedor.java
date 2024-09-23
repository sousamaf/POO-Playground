package desafios.heranca;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void trabalhar(){
        System.out.println(nome + " está desenvolvendo software.");
    }

    public void design(){
        System.out.println(nome + " está projetando um sistema.");
    }
}
