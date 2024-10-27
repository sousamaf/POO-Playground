package projetos.supermercado;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Conteúdo para as aulas de Coleções e Tratamento de exceção
public class Carrinho {
    private List<Vendavel> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Vendavel item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Vendavel item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void exibirItens() {
        for (Vendavel item : itens) {
            System.out.println("Item: " + item.getDescricao()
                    + " \n\t Preço: R$ " + item.getPreco()
                    + " \n\t Imposto: R$ " + ((Produto) item).calcularImposto());
        }
    }

    // Método para registrar vendas em um arquivo.
    public void registrarVendas(String nomeArquivo) {
        LocalDate dataVenda = LocalDate.now(); // Data atual
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataVenda.format(formatter);

        // Obtém o caminho do package usando o caminho relativo ao package do código
        String caminho = System.getProperty("user.dir") + "/projetos/supermercado/" + nomeArquivo;

        try (FileWriter writer = new FileWriter(caminho, true)) { // 'true' para modo append
            for (Vendavel item : itens) {
                writer.write(
                        dataFormatada + "," +
                                item.getDescricao() + "," +
                                item.getPreco() + "," +
                                ((Produto) item).calcularImposto() + "\n");
            }
            System.out.println("Vendas registradas com sucesso no arquivo " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao registrar vendas: " + e.getMessage());
        }
    }
}
