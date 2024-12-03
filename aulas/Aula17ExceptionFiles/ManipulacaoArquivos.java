import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManipulacaoArquivos {
    public static void main(String[] args) {
        String caminhoArquivo = System.getProperty("user.dir") + "/aulas/Aula17ExceptionFiles/arquivo.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro de leitura: " + e.getMessage());
        }
    }
}
