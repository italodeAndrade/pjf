import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Leitura {

    public static void lerImoveisNovos(String caminhoArquivo, List<Imovel_novo> listaImoveis) {
        File arquivo = new File(caminhoArquivo);

        try (Scanner leitor = new Scanner(arquivo)) {
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] partes = linha.split(",");

                if (partes.length == 14) {
                    String endereco = partes[0].trim();
                    double area = Double.parseDouble(partes[1].trim());
                    String cep = partes[2].trim();
                    String anoConstrucao = partes[3].trim();
                    double preco = Double.parseDouble(partes[4].trim());
                    boolean dispVenda = Boolean.parseBoolean(partes[5].trim());
                    boolean dispAluguel = Boolean.parseBoolean(partes[6].trim());
                    int numQuartos = Integer.parseInt(partes[7].trim());
                    double vlrAluguel = Double.parseDouble(partes[8].trim());
                    boolean mobiliado = Boolean.parseBoolean(partes[9].trim());
                    boolean semiMobiliado = Boolean.parseBoolean(partes[10].trim());
                    int idImovel = Integer.parseInt(partes[11].trim());
                    String dtInicAluguel = partes[12].trim();
                    String dtFnAluguel = partes[13].trim();

                    Imovel_novo imovel = new Imovel_novo(area, cep, endereco, anoConstrucao, preco, dispVenda,
                            dispAluguel, numQuartos, vlrAluguel, mobiliado, semiMobiliado, idImovel,
                            dtInicAluguel, dtFnAluguel);

                    listaImoveis.add(imovel);
                }
                 else {
                    System.out.println("Formato de linha inválido: " + linha);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }

    public static void lerImoveisVelho(String caminhoArquivo, List<Imovel_Velho> listaImoveisVelhos) {
        File arquivo = new File(caminhoArquivo);

        try (Scanner leitor = new Scanner(arquivo)) {
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] partes = linha.split(",");

                if (partes.length == 14) {
                    String endereco = partes[0].trim();
                    double area = Double.parseDouble(partes[1].trim());
                    String cep = partes[2].trim();
                    String anoConstrucao = partes[3].trim();
                    double preco = Double.parseDouble(partes[4].trim());
                    boolean dispVenda = Boolean.parseBoolean(partes[5].trim());
                    boolean dispAluguel = Boolean.parseBoolean(partes[6].trim());
                    int numQuartos = Integer.parseInt(partes[7].trim());
                    double vlrAluguel = Double.parseDouble(partes[8].trim());
                    boolean mobiliado = Boolean.parseBoolean(partes[9].trim());
                    boolean semiMobiliado = Boolean.parseBoolean(partes[10].trim());
                    int idImovel = Integer.parseInt(partes[11].trim());
                    String dtInicAluguel = partes[12].trim();
                    String dtFnAluguel = partes[13].trim();

                    Imovel_Velho imovel = new Imovel_Velho(area, cep, endereco, anoConstrucao, preco, dispVenda,
                            dispAluguel, numQuartos, vlrAluguel, mobiliado, semiMobiliado, idImovel,
                            dtInicAluguel, dtFnAluguel);

                    listaImoveisVelhos.add(imovel);
                } 
                else {
                    System.out.println("Formato de linha inválido: " + linha);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}
