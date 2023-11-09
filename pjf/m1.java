import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class m1 {
    public static void main(String[] args) {

        Leitura leitorimoveis= new Leitura();
        leitorimoveis.importarImoveis();
        
         List<Imovel_novo> listaImoveis_novos = new ArrayList<>();
        List<Imovel_Velho> listaImoveis_velhos = new ArrayList<>();
   
        Scanner scanner = new Scanner(System.in);

        // Cadastrar imóveis novos e velhos
        Imovel_Velho.cadastrar_Imovel_Velho(scanner, listaImoveis_velhos);
        Imovel_novo.cadastrar_Imovel_novo(scanner, listaImoveis_novos);
        System.out.println(listaImoveis_novos.toString());
        System.out.println(listaImoveis_velhos.toString());

        // Cadastrar cliente pessoa física
        System.out.println("Cadastrar cliente pessoa física:");
        P_fisica.cadastrarFisica(scanner);

        // Cadastrar cliente pessoa jurídica
        System.out.println("Cadastrar cliente pessoa jurídica:");
        P_juridica.cadastrarJuridica(scanner);

        // Cadastrar corretor
        System.out.println("Cadastrar corretor:");
        Corretor corretor1 = Corretor.cadastrarCorretor(scanner);

        // Cadastro do dono do imovel
        System.out.println("Cadastrar Proprietário:");
        Dono_Imovel.cadastrarDono_imovel(scanner);

        // Calcular comissão do corretor
        System.out.println("Calcular comissão para o corretor:");
        Imovel_Velho imovel = new Imovel_Velho(0, null, null, null, 0, false, false, 0, 0, false, false, 0, null, null); // Substitua com uma instância de Imovel válida
        corretor1.calcular_comissao(imovel);

        // Visualizar histórico de comissões do corretor
        System.out.println("Histórico de comissões do corretor:");
        corretor1.visualizarHistoricoComissoes();
        
        // Serialização dos objetos // Salvar objetos persistentes
String nomeArquivo = "objetos_serializados.dat";
try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
    outputStream.writeObject(listaImoveis_novos);
    outputStream.writeObject(listaImoveis_velhos);
    outputStream.writeObject(P_fisica.getListaClientesPF());
    outputStream.writeObject(P_juridica.getListaClientesPJ());
    outputStream.writeObject(corretor1);
    outputStream.writeObject(Dono_Imovel.getListaDonosImoveis());
} catch (IOException e) {
    e.printStackTrace();
}
        }
}













