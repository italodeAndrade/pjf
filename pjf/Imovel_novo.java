public class Imovel_novo extends Imoveis {
    public Imovel_novo(double area, String cep, String endereco, String ano_construcao, double preco, boolean dispVenda, boolean dispAluguel, int numQuartos, double vlrAluguel, boolean mobiliado, boolean semiMobiliado, int id_imovel, String dt_inic_aluguel, String dt_fn_aluguel) {
        super(area, cep, endereco, ano_construcao, preco, dispVenda, dispAluguel, numQuartos, vlrAluguel, mobiliado, semiMobiliado, id_imovel, dt_inic_aluguel, dt_fn_aluguel);
    }


    // Construtor


    //Métodos


    // calcular o valor do imóvel novo
    @Override
    public double calcular_valor_imovel() {
        double valorBase = this.area * 1500; // R$ 1500 por metro quadrado
        int anoConstrucao = Integer.parseInt(this.ano_construcao);
        int idade = 2023 - anoConstrucao;
        double valorizacaoEndereco = 0.02; // 2% de valorização por ano para um bom endereço
        double valorFinal = valorBase + (valorBase * valorizacaoEndereco * idade);

        return valorFinal;
    }

    // Calcular o valor do aluguel de um imóvel novo
    @Override
    public double calcular_valor_aluguel() {
        // 1% do valor atual do imóvel por mês
        double valorAtual = calcular_valor_imovel();
        double valorAluguel = valorAtual * 0.01;

        return valorAluguel;
    }

    // Valorização baseada no endereço
    @Override
    public double calcularValorizacao(int anos) {
        // Valorização de endereço
        double valorizacaoEndereco = 0.02; // 2% de valorização por ano para um bom endereço

        // Valorização total ao longo dos anos
        double valorizacaoTotal = Math.pow(1 + valorizacaoEndereco, anos);

        return calcular_valor_imovel() * valorizacaoTotal;
    }

    // Desvalorização não é aplicável a imóveis novos
    @Override
    public double calcularDesvalorizacao(int anos) {
        return calcular_valor_imovel();
    }

    @Override
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
}


