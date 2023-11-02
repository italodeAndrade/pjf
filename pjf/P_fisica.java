import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class P_fisica extends Cliente {
    boolean inter_compra;
    boolean inter_aluguel;
    String cpf;

    // Lista para armazenar clientes pessoa física
    private static List<P_fisica> listaClientesPF = new ArrayList<>();

    public P_fisica(String cpf, String nome, String email, String endereco, long telefone, String dt_nascimento,
                    float renda_presumida, int RG, boolean inter_aluguel, boolean inter_compra) {
        super(nome, email, endereco, telefone, dt_nascimento, renda_presumida, RG, RG);
        this.inter_aluguel = inter_aluguel;
        this.inter_compra = inter_compra;
        this.cpf = cpf;
    }

    public static P_fisica cadastrarFisica(Scanner scanner) {
        System.out.println("Preencha as informações do cliente:");

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        long telefone = scanner.nextLong();
        scanner.nextLine();  // Consumir a nova linha pendente

        System.out.print("Data de Nascimento: ");
        String dt_nascimento = scanner.nextLine();

        System.out.print("Renda Presumida: ");
        float renda_presumida = scanner.nextFloat();

        System.out.print("RG: ");
        int RG = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Interesse em Compra (true/false): ");
        boolean inter_compra = scanner.nextBoolean();

        System.out.print("Interesse em Aluguel (true/false): ");
        boolean inter_aluguel = scanner.nextBoolean();
        scanner.nextLine();

        P_fisica fisicaCliente = new P_fisica(cpf, nome, email, endereco, telefone, dt_nascimento, renda_presumida, RG, inter_aluguel, inter_compra);

        // Adiciona o cliente à lista
        listaClientesPF.add(fisicaCliente);

        System.out.println("Cliente pessoa física cadastrado com sucesso.");

        return fisicaCliente;
    }

    // Getter para a lista de clientes pessoa física
    public static List<P_fisica> getListaClientesPF() {
        return listaClientesPF;
    }
}




