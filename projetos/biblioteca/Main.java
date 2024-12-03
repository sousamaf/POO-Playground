package projetos.biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        LivroFisico livroFisico = new LivroFisico("Java para Iniciantes", "Autor A", "Programação", 300);
        LivroDigital livroDigital = new LivroDigital("Python para Iniciantes", "Autor B", "Programação", 2.5);

        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(livroDigital);

        biblioteca.exibirLivros();
    }

}
