package projetos.biblioteca;

public class LivroFisico extends Livro implements Emprestavel {
    private int numeroDePaginas;
    private boolean emprestado = false;

    public LivroFisico(String titulo, String autor, String genero, int numeroDePaginas) {
        super(titulo, autor, genero);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    @Override
    public void emprestar() {
        this.emprestado = true;
        System.out.println("Livro físico emprestado: " + this.getTitulo());
    }

    @Override
    public void devolver() {
        this.emprestado = false;
        System.out.println("Livro físico devolvido: " + this.getTitulo());
    }
}
