package desafios;

public class ContaBancariaOriginal {
    public double saldo;
    public String titular;
    public String numeroDaConta;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }    
}
