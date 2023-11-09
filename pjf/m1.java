import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class m1 {
    public static void main(String[] args) {
        List<Imovel_novo> listaImoveisNovos = new ArrayList<>();
        List<Imovel_Velho> listaImoveisVelhos = new ArrayList<>();

        String caminhoArquivoNovos = "arquivo txt\\imóveis novos.txt";
        Leitura.lerImoveisNovos(caminhoArquivoNovos, listaImoveisNovos);

        String caminhoArquivoVelhos = "arquivo txt\\imóveis velhos.txt";
        Leitura.lerImoveisVelho(caminhoArquivoVelhos, listaImoveisVelhos);

        Scanner scanner = new Scanner(System.in);

        Imovel_Velho.cadastrar_Imovel_Velho(scanner, listaImoveisVelhos);
        Imovel_novo.cadastrar_Imovel_novo(scanner, listaImoveisNovos);

        System.out.println(listaImoveisNovos.toString());
        System.out.println(listaImoveisVelhos.toString());

        System.out.println("Cadastrar cliente pessoa física:");
        P_fisica.cadastrarFisica(scanner);

        System.out.println("Cadastrar cliente pessoa jurídica:");
        P_juridica.cadastrarJuridica(scanner);

        System.out.println("Cadastrar corretor:");
        Corretor corretor1 = Corretor.cadastrarCorretor(scanner);

        System.out.println("Cadastrar Proprietário:");
        Dono_Imovel.cadastrarDono_imovel(scanner);

        System.out.println("Calcular comissão para o corretor:");
        Imovel_Velho imovel = new Imovel_Velho(0, null, null, null, 0, false, false, 0, 0, false, false, 0, null, null);
        corretor1.calcular_comissao(imovel);

        System.out.println("Histórico de comissões do corretor:");
        corretor1.visualizarHistoricoComissoes();

        String nomeArquivo = "objetos_serializados.dat";
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(listaImoveisNovos);
            outputStream.writeObject(listaImoveisVelhos);
            outputStream.writeObject(P_fisica.getListaClientesPF());
            outputStream.writeObject(P_juridica.getListaClientesPJ());
            outputStream.writeObject(corretor1);
            outputStream.writeObject(Dono_Imovel.getListaDonosImoveis());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
