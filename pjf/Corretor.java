import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Corretor extends Pessoa {
    private List<Double> historicoComissoes = new ArrayList<>();
    private static List<Corretor> listaCorretores = new ArrayList<>();

    public Corretor(String nome, String email, String endereco, long telefone, String dt_nascimento, int RG, double comissao) {
        super(nome, email, endereco, telefone, dt_nascimento, RG);
        listaCorretores.add(this);
    }

    public static Corretor cadastrarCorretor(Scanner scanner) {
        System.out.println("Preencha as informações do corretor:");

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

        System.out.print("RG: ");
        int RG = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Comissão: ");
        double comissao = scanner.nextDouble();
        scanner.nextLine();

        Corretor corretor = new Corretor(nome, email, endereco, telefone, dt_nascimento, RG, comissao);
        System.out.println("Corretor cadastrado com sucesso.");
        return corretor;
    }

    public void calcular_comissao(Imoveis imovel) {
        double valor = imovel.getpreco(); // Assumindo que a classe Imovel tem um método getPreco() para obter o preço do imóvel.
        double comissao = valor * 0.04;
        historicoComissoes.add(comissao);
        System.out.println(nome + " recebeu uma comissão de " + comissao + " reais pela venda de um imóvel.");
    }

    public void visualizarHistoricoComissoes() {
        System.out.println("Histórico de Comissões para o corretor " + nome + ":");
        for (int i = 0; i < historicoComissoes.size(); i++) {
            System.out.println("Comissão " + (i + 1) + ": " + historicoComissoes.get(i) + " reais");
        }
    }
}
