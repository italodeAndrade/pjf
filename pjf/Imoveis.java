public abstract class Imoveis implements contrato_aluguel{

    // Atributos de imoveis
    double area;
    String cep;
    String endereco;
    String ano_construcao;
    double preco;
    boolean disp_venda;
    boolean disp_alugel;
    int num_quartos;
    double vlr_alugel;
    boolean mobiliado;
    boolean semi_mobiliado;
    Pessoa fiador;
    Pessoa comprador;
    int id_imovel;
    String dt_inic_aluguel;
    String dt_fn_aluguel;


    // Construtor de imoveis
    public Imoveis(double area, String cep, String endereco, String ano_construcao, double preco,
                   boolean dispVenda, boolean dispAluguel, int numQuartos,
                   double vlrAluguel, boolean mobiliado, boolean semiMobiliado,
                   int id_imovel, String dt_inic_aluguel, String dt_fn_aluguel) {
        this.area = area;
        this.cep = cep;
        this.endereco = endereco;
        this.ano_construcao = ano_construcao;
        this.preco = preco;
        this.disp_venda = dispVenda;
        this.disp_alugel = dispAluguel;
        this.num_quartos = numQuartos;
        this.vlr_alugel = vlrAluguel;
        this.mobiliado = mobiliado;
        this.semi_mobiliado = semiMobiliado;
        this.fiador=null;
        this.comprador=null;
        this.id_imovel=id_imovel;
        this.dt_inic_aluguel = dt_inic_aluguel;
        this.dt_fn_aluguel = dt_fn_aluguel;
    }

    // Métodos de imoveis

    // O valor/alugel do imovel é abstrato pois será diferente para a idade do imovel
    public abstract double calcular_valor_imovel();
    public abstract double calcular_valor_aluguel();

    //uma ideia que eu tive sobre o desconto é ofrecer apenas para compra à vista
    // Método concreto para calcular o valor do desconto (implementação padrão)
    public double calcular_valor_desconto(double valorCompraAVista) {
        // Lógica de cálculo de desconto (pode ser a mesma para todos os tipos de imóveis)
        double desconto = valorCompraAVista * 0.10; // Exemplo de desconto de 10%
        return desconto;
    }


    // deixamos esse método ou removemos ele ?
    public int verificarIdade() {
        int anoAtual = 2023;
        int idade = anoAtual - Integer.parseInt(ano_construcao);
        return idade;
    }

    // será igual nos 2 tipos de imoveis
    public boolean verificarMobiliado() {
        return mobiliado || semi_mobiliado;

    }

    public boolean verificarDisponibilidade(boolean aceitaAluguel, boolean aceitaVenda) {
        // Lógica para verificar a disponibilidade para aluguel e/ou venda
        if (aceitaAluguel && aceitaVenda) {
            return true; // Aceita tanto aluguel quanto venda
        } else if (aceitaAluguel) {
            return disp_alugel; // Aceita apenas aluguel se disponível
        } else if (aceitaVenda) {
            return disp_venda; // Aceita apenas venda se disponível
        } else {
            return false; // Não aceita aluguel nem venda
        }
    }

    public double getpreco() {
        return 0;
    }
}
