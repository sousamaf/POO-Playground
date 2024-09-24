package aulas.Aula08Pratica;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria", "123456789-00", "555-5555");
        ContaBancaria contaBancaria1 = new ContaBancaria(cliente1, 1000, 300.00);

        // Cliente cliente2 = new Cliente("Lampião", "987654321-00", "555-5554");
        // ContaBancaria contaBancaria2 = new ContaBancaria(cliente2, 999, 800.00);

        // contaBancaria1.imprimirDetalhes();

        // contaBancaria1.depositar(-11);
        // contaBancaria1.depositar(1230);
        // contaBancaria1.sacar(200);

        // contaBancaria1.imprimirDetalhes();
        
        // contaBancaria2.imprimirDetalhes();

        double valor = 150.00;
        int op = 3;
        switch (op) {
            case 0:
                contaBancaria1.depositar(valor);
                break;
            case 1:
                contaBancaria1.sacar(valor);
                break;
            default:
                contaBancaria1.imprimirDetalhes();
                break;
        }
    }
}
