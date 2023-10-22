import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class P_juridica extends Cliente implements Serializable {
    boolean inter_compra;
    boolean inter_aluguel;
    String cnpj;

    // Construtor
    public P_juridica(String nome, String email, String endereco, long telefone, String dt_nascimento,
                      float renda_presumida, int RG, String cnpj, boolean inter_aluguel, boolean inter_compra, int id_imv_c) {
        super(nome, email, endereco, telefone, dt_nascimento, renda_presumida, RG, id_imv_c);
        this.inter_aluguel = inter_aluguel;
        this.inter_compra = inter_compra;
        this.cnpj = cnpj;
    }

    // Cadastro de clientes e armazenamento em uma lista
    public static List<P_juridica> cadastrarClientes(List<P_juridica> listaClientes) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira as informações do cliente pessoa jurídica:");
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        System.out.print("Telefone: ");
        long telefone = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Data de Nascimento: ");
        String dt_nascimento = scanner.nextLine();

        System.out.print("Renda Presumida: ");
        float renda_presumida = scanner.nextFloat();

        System.out.print("RG: ");
        int RG = scanner.nextInt();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        // Crie um novo objeto P_juridica com os dados inseridos
        P_juridica novoCliente = new P_juridica("Nome", "Email", "Endereço", telefone, dt_nascimento, renda_presumida, RG, cnpj, true, true, 0);

        // Adicione o novo cliente à lista
        listaClientes.add(novoCliente);

        System.out.println("Cliente pessoa jurídica cadastrado com sucesso.");

        return listaClientes;
    }
}

