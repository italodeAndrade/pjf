import java.util.Scanner;

//declaração da classe herdada de cliente
public class P_juridica extends Cliente {
    boolean inter_compra;
    boolean inter_alugel;
    String cnpj;

    //construtor
    public P_juridica(String nome, String email, String endereço, long telefone, String dt_nascimento,
                      float renda_presumida, int RG, String cnpj, boolean inter_alugel, boolean inter_compra, double saldo, int id_imv_c) {
        super(nome, email, endereço, telefone, dt_nascimento, renda_presumida, RG, saldo, id_imv_c);
        this.inter_alugel = inter_alugel;
        this.inter_compra = inter_compra;
        this.cnpj = cnpj;
    }

    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira as informações do cliente pessoa jurídica:");
        System.out.print("CNPJ: ");
        cnpj = scanner.nextLine();

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



