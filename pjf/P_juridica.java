import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class P_juridica extends Cliente implements Serializable {
    boolean inter_compra;
    boolean inter_aluguel;
    String cnpj;

    // Lista para armazenar clientes pessoa jurídica
    private static List<P_juridica> listaClientesPJ = new ArrayList<>();

    // Construtor
    public P_juridica(String nome, String email, String endereco, long telefone, String dt_nascimento,
                      float renda_presumida, String cnpj, boolean inter_aluguel, boolean inter_compra, int id_imv_c) {
        super(nome, email, endereco, telefone, dt_nascimento, renda_presumida, id_imv_c, id_imv_c);
        this.inter_aluguel = inter_aluguel;
        this.inter_compra = inter_compra;
        this.cnpj = cnpj;
    }

    // Cadastro de clientes e armazenamento em uma lista
    public static P_juridica cadastrarJuridica(Scanner scanner) {
        System.out.println("Preencha as informações do cliente:");

        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        long telefone = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Data de Nascimento: ");
        String dt_nascimento = scanner.nextLine();

        System.out.print("Renda Presumida: ");
        float renda_presumida = scanner.nextFloat();

        P_juridica juridicaCliente = new P_juridica(nome, email, endereco, telefone, dt_nascimento, renda_presumida, cnpj, true, true, 0);

        // Adiciona o cliente à lista
        listaClientesPJ.add(juridicaCliente);

        System.out.println("Cliente pessoa jurídica cadastrado com sucesso.");

        return juridicaCliente;
    }

    // Getter para a lista de clientes pessoa jurídica
    public static List<P_juridica> getListaClientesPJ() {
        return listaClientesPJ;
    }
}
