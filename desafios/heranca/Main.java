package desafios.heranca;

public class Main {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Helena", 5000);
        Gerente gerente = new Gerente("Miguel", 7000, 2000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Heitor", 6000);

        funcionario.trabalhar();
        System.out.println("Salário: " + funcionario.getSalario());

        gerente.trabalhar();
        gerente.gerenciar();
        System.out.println("Salário: " + gerente.getSalario());

        desenvolvedor.trabalhar();
        desenvolvedor.design();
        System.out.println("Salário: " + desenvolvedor.getSalario());
    }
}
