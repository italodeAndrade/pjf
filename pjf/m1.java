import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class m1 {
    public static void main(String[] args) {
        List<Imovel_novo> listaImoveis_novos = new ArrayList<>();
        List<Imovel_Velho> listaImoveis_velhos = new ArrayList<>();
        List<P_fisica> fisicaList = new ArrayList<>();
        List<P_juridica> juridicaList = new ArrayList<>();
        List<Dono_Imovel> listaPessoas = new ArrayList<>();
       
        Scanner scanner = new Scanner(System.in);

        // Cadastrar imóveis novos e velhos
        Imovel_Velho.cadastrar_Imovel_Velho(scanner, listaImoveis_velhos);
        Imovel_novo.cadastrar_Imovel_novo(scanner, listaImoveis_novos);

        // Cadastrar clientes pessoa física
        System.out.println("Cadastrar cliente pessoa física:");
        P_fisica clientePF1 = P_fisica.cadastrarCliente(scanner);
        fisicaList.add(clientePF1);

        // Cadastrar clientes pessoa jurídica
        System.out.println("Cadastrar cliente pessoa jurídica:");
        P_juridica clientePJ1 = P_juridica.cadastrarCliente(scanner);
        juridicaList.add(clientePJ1);

        System.out.println(listaImoveis_novos.toString());
        System.out.println(listaImoveis_velhos.toString());
        System.out.println(fisicaList.toString());
        System.out.println(juridicaList.toString());

        // Teste Corretor
        Corretor c = new Corretor(null, null, null, 0, null, 0, 0, 0, 0);
        System.out.println("Cadastrar Salario do Corretor:");
        c.depositar_salario();
        
        //Teste dono_imovel
        Dono_Imovel d = new Dono_Imovel(null, null, null, null, 0, null, 0, 0, null, 0, 0);
        System.out.println("Cadastrar dono do imovel:");
        d.cadastrarDono_imovel(scanner, listaPessoas);
        
    }
}

