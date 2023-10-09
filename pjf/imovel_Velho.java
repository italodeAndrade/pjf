public class imovel_Velho extends imoveis {

    public imovel_Velho(double area, String cep, String endereco, String anoConstrucao, double preco, boolean dispVenda, boolean dispAluguel, int numQuartos, double vlrAluguel, boolean mobiliado, boolean semiMobiliado) {
        super(area, cep, endereco, anoConstrucao, preco, dispVenda, dispAluguel, numQuartos, vlrAluguel, mobiliado, semiMobiliado);
    }

    //calcular o valor do imóvel velho
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

    // Valorização não é aplicável a imóveis antigos
    @Override
    public double calcularValorizacao(int anos) {
        return 0;
    }

    // Calcular a desvalorização de imóveis antigos
    @Override
    public double calcularDesvalorizacao(int anos) {
        double desvalorizacaoAnual = 0.02; // 2% de desvalorização anual
        double valorAtual = calcular_valor_imovel();

        // Aplicar a desvalorização para cada ano
        for (int i = 0; i < anos; i++) {
            valorAtual -= valorAtual * desvalorizacaoAnual;
        }

        return valorAtual;
    }
}


