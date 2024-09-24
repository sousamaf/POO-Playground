package aulas.Aula08Pratica;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimirDetalhesCliente(){
        System.out.println("Detalhes do cliente:");
        System.out.println("\tNome: " + this.getNome());
        System.out.println("\tCPF: " + this.getCpf());
        System.out.println("\tTelefone: " + this.getTelefone());
    }
}
