package projetos.biblioteca;

public class LivroDigital extends Livro implements Emprestavel {
    private double tamanhoDoArquivo;
    private boolean emprestado = false;

    public LivroDigital(String titulo, String autor, String genero, double tamanhoDoArquivo) {
        super(titulo, autor, genero);
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    public double getTamanhoDoArquivo() {
        return tamanhoDoArquivo;
    }

    @Override
    public void emprestar() {
        this.emprestado = true;
        System.out.println("Livro digital emprestado: " + this.getTitulo());
    }

    @Override
    public void devolver() {
        this.emprestado = false;
        System.out.println("Livro digital devolvido: " + this.getTitulo());
    }

}
