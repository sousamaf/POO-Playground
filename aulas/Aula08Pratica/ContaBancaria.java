package aulas.Aula08Pratica;

public class ContaBancaria {
    private Cliente cliente;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(Cliente cliente, int numeroConta, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = (saldo > 0)? saldo: 0.0;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if(valor >= 0.0){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso. Seu saldo atual é R$ " + this.saldo);
            // this.saldo = this.saldo + valor; // é o mesmo que a linha anterior
        } else {
            System.out.println("O valor depositado é negativo.");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= this.saldo) {
            //saque
            this.saldo -= valor;
            System.out.println("Vocês salcou R$ " + valor + ". Seu saldo atual é de R$ " + this.saldo);
            // this.saldo = this.saldo - valor // é o mesmo que a linha anterior.
        } else {
            System.out.println("Seu saldo é inferior ao valor solicitado.");
        }

    }

    public void imprimirDetalhes() {
        System.out.println("Detalhes da Conta:");
        System.out.println("\tCliente: " + this.cliente.getNome());
        System.out.println("\tNúmero da conta: " + this.numeroConta);
        System.out.println("\tSaldo atual: R$ " + this.saldo);
        System.out.println("\tTelefone: " + this.cliente.getTelefone());
    }

    
}
