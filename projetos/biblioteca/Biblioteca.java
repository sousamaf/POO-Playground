package projetos.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void exibirLivros() {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Gênero: " + livro.getGenero());
            if (livro instanceof LivroFisico) {
                LivroFisico livroFisico = (LivroFisico) livro;
                System.out.println("Número de páginas: " + livroFisico.getNumeroDePaginas());
            } else if (livro instanceof LivroDigital) {
                LivroDigital livroDigital = (LivroDigital) livro;
                System.out.println("Tamanho do arquivo: " + livroDigital.getTamanhoDoArquivo());
            }
            System.out.println();
        }
    }
}
