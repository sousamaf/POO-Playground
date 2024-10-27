package projetos.supermercado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Supermercado {

    public static void main(String[] args) {
        Alimento arroz = new Alimento("Arroz", 38.0, "01/12/2025", true);
        Alimento chocolate = new Alimento("Chocolate", 20.0, "01/02/2026", false);
        Limpeza detergente = new Limpeza("Detergente", 5.0, false);
        Limpeza aguaSanitaria = new Limpeza("Água Sanitária", 8.90, true);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(arroz);
        carrinho.adicionarItem(chocolate);
        carrinho.adicionarItem(detergente);
        carrinho.adicionarItem(aguaSanitaria);

        carrinho.exibirItens();
        System.out.println("Total: R$" + carrinho.calcularTotal());

        // Registrar vendas em um arquivo
        carrinho.registrarVendas("vendas.txt");

        // Simulação do fim do mês para calcular o imposto total
        calcularImpostoTotal("vendas.txt");
    }

    // Método para calcular o imposto total a partir do arquivo de vendas
    // Conteúdo da aula de arquivos.
    public static void calcularImpostoTotal(String nomeArquivo) {
        double impostoMesAtual = 0;
        double impostoMesAnterior = 0;

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataMesAnterior = dataAtual.minusMonths(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String caminho = System.getProperty("user.dir") + "/projetos/supermercado/" + nomeArquivo;

        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 4) {
                    String dataVendaStr = dados[0];
                    double imposto = Double.parseDouble(dados[3]);

                    try {
                        LocalDate dataVenda = LocalDate.parse(dataVendaStr, formatter);
                        if (dataVenda.getYear() == dataAtual.getYear()
                                && dataVenda.getMonth() == dataAtual.getMonth()) {
                            impostoMesAtual += imposto;
                        } else if (dataVenda.getYear() == dataMesAnterior.getYear()
                                && dataVenda.getMonth() == dataMesAnterior.getMonth()) {
                            impostoMesAnterior += imposto;
                        }
                    } catch (DateTimeParseException e) {
                        System.out.println("Erro ao analisar a data: " + e.getMessage());
                    }
                }
            }
            System.out.println("Imposto devido no mês atual: R$" + impostoMesAtual);
            System.out.println("Imposto devido no mês anterior: R$" + impostoMesAnterior);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de vendas: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro no formato dos dados no arquivo: " + e.getMessage());
        }
    }
}
