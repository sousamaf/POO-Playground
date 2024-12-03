package projetos.biblioteca;

public class LivroFisico extends Livro {
    private int numeroDePaginas;

    public LivroFisico(String titulo, String autor, String genero, int numeroDePaginas) {
        super(titulo, autor, genero);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
}
