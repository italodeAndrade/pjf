import java.util.Scanner;

public class P_fisica extends Cliente {
    boolean inter_compra;
    boolean inter_aluguel;
    String cpf;

    // Construtor
    public P_fisica(String cpf, String nome, String email, String endereco, long telefone, String dt_nascimento,
                    float renda_presumida, int RG, boolean inter_aluguel, boolean inter_compra, double saldo, int id_imv_c) {
        super(nome, email, endereco, telefone, dt_nascimento, renda_presumida, RG, saldo, id_imv_c);
        this.inter_aluguel = inter_aluguel;
        this.inter_compra = inter_compra;
        this.cpf = cpf;
    }

    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira as informações do cliente pessoa física:");
        System.out.print("CPF: ");
        cpf = scanner.nextLine();

        System.out.print("Telefone: ");
        telefone = scanner.nextLong();
        scanner.nextLine();  // Consumir a nova linha pendente

        System.out.print("Data de Nascimento: ");
        dt_nascimento = scanner.nextLine();

        System.out.print("Renda Presumida: ");
        renda_presumida = scanner.nextFloat();

        System.out.print("RG: ");
        RG = scanner.nextInt();

    }
}