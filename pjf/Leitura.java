import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura {
    public void importarImoveis() {
        File arquivo = new File("arquivo txt\\imóveis.txt");

        Scanner leitor = null;

        try {
            leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } finally {
            if (leitor != null) {
                leitor.close();
            }
        }
    }
}
