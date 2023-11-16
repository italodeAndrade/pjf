import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imovel_Velho extends Imoveis implements Serializable{
        List <Imovel_Velho> lista_Imoveis_velhos= new ArrayList<>();
    public Imovel_Velho(double area, String cep, String endereco, String ano_construcao,
        double preco, boolean dispVenda, boolean dispAluguel, int numQuartos, double vlrAluguel,
        boolean mobiliado, boolean semiMobiliado, int id_imovel, String dt_inic_aluguel, String dt_fn_aluguel) {
        super(area, cep, endereco, ano_construcao, preco, dispVenda, dispAluguel, numQuartos, vlrAluguel, mobiliado, semiMobiliado, id_imovel, dt_inic_aluguel, dt_fn_aluguel);
    }

    // Métodos

    // Calcular o valor do imóvel velho
    @Override
    public double calcular_valor_imovel() {
        double valorBase = this.area * 1000; // R$ 1000 por metro quadrado
        int anoConstrucao = Integer.parseInt(this.ano_construcao);
        int idade = 2023 - anoConstrucao;

        // O valor do imóvel desvaloriza 2% a cada ano
        double desvalorizacao = 0.02 * idade;
        double valorFinal = valorBase - (valorBase * desvalorizacao);

        return valorFinal;
    }

    // Calcular o valor do aluguel de um imóvel velho
    @Override
    public double calcular_valor_aluguel() {
        // 1% do valor atual do imóvel por mês
        double valorAtual = calcular_valor_imovel();
        double valorAluguel = valorAtual * 0.01;

        return valorAluguel;
    }

    public double calcularValorAluguel() {
        return 0;
    }

    @Override
    public String getDtInicAluguel() {
        return null;
    }

    @Override
    public String getDtFnAluguel() {
        return null;
    }

    // Cadastro de imóveis antigos e armazenamento em uma lista
    public static void cadastrar_Imovel_Velho(Scanner scanner, List<Imovel_Velho> listaImoveis_velhos) {
//        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira as informações do imóvel velho:");

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Área: ");
        double area = scanner.nextDouble();

        System.out.print("CEP: ");
        String cep = scanner.next();

        System.out.print("Ano de Construção: ");
        String anoconstrucao = scanner.next();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Disponível para venda (V/F): ");
        String dispVendaInput = scanner.next();
        boolean dispVenda = dispVendaInput.equalsIgnoreCase("v");

        System.out.print("Disponível para alugar (V/F): ");
        String dispAluguelInput = scanner.next();
        boolean dispAluguel = dispAluguelInput.equalsIgnoreCase("v");

        System.out.print("Número de quartos: ");
        int numQuartos = scanner.nextInt();

        System.out.print("Valor do aluguel: ");
        double vlrAluguel = scanner.nextDouble();

        System.out.print("É mobiliado (V/F): ");
        String mobiliadoInput = scanner.next();
        boolean mobiliado = mobiliadoInput.equalsIgnoreCase("v");

        System.out.print("Semi mobiliado (V/F): ");
        String semiMobiliadoInput = scanner.next();
        boolean semiMobiliado = semiMobiliadoInput.equalsIgnoreCase("v");

        System.out.print("Qual o ID do imóvel: ");
        int id_imovel = scanner.nextInt();

        System.out.print("Qual a data de início do contrato: ");
        String dt_inic_aluguel = scanner.next();

        System.out.print("Qual a data do final do contrato: ");
        String dt_fn_aluguel = scanner.next();

        Imovel_Velho velhoImovel = new Imovel_Velho(area, cep, endereco, anoconstrucao, preco, dispVenda, dispAluguel, numQuartos, vlrAluguel, mobiliado, semiMobiliado, id_imovel, dt_inic_aluguel, dt_fn_aluguel);

        listaImoveis_velhos.add(velhoImovel);

        System.out.println("Imóvel velho cadastrado com sucesso.");
    }

}
