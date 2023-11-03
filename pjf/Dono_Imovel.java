import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Dono_Imovel extends Pessoa {
    int id_imovel;
    String CPF;
    String CNPJ;

    // Lista para armazenar informações dos donos de imóveis
    private static List<Dono_Imovel> listaDonosImoveis = new ArrayList<>();

    public Dono_Imovel(String CPF, String nome, String email, String endereco, long telefone, String dt_nascimento,
                      float renda_presumida, int RG, String CNPJ, int id_imovel, double saldo) {
        super(nome, email, endereco, telefone, dt_nascimento, RG);
        this.id_imovel = id_imovel;
        this.CNPJ = CNPJ;
        this.CPF = CPF;
    }

    // Cadastro do dono do imovel
public static void cadastrarDono_imovel(Scanner scanner) {
     System.out.println("Por favor, insira as informações do Proprietário:");
 
     System.out.print("ID do Imóvel: ");
     int id_imovel = scanner.nextInt();
     scanner.nextLine(); // Consumir a nova linha pendente
 
     System.out.print("CNPJ: ");
     String CNPJ = scanner.nextLine();
 
     System.out.print("CPF: ");
     String cpf = scanner.nextLine();
 
     Dono_Imovel donoImovel = new Dono_Imovel(cpf, null, null, null, 0, null, 0, id_imovel, CNPJ, id_imovel, 0);
 
     // Adicionar o dono do imóvel à lista
     listaDonosImoveis.add(donoImovel);
 }

      // Getter para a lista de donos de imóveis
    public static List<Dono_Imovel> getListaDonosImoveis() {
     return listaDonosImoveis;
 }

}




