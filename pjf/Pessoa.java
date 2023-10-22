
public abstract class Pessoa {

    //atributos de pessoa
    String nome;
    String email;
    String endereco;
    long telefone;
    String dt_nascimento;
    float renda_presumida;
    int RG;
    double saldo;
    double poupança;

    //construtor de pessoa
    public Pessoa (String nome,String email,String endereco,long telefone,
    String dt_nascimento,float renda_presumida,int RG){

        this.nome=nome;
        this.email=email;
        this.endereco=endereco;
        this.telefone=telefone;
        this.dt_nascimento=dt_nascimento;
        this.renda_presumida=renda_presumida;
    }
    //metodo de soma de salario
    public void depositar_salario(double valor){
        saldo+=valor;
        System.out.println("foi adicionado "+valor+" a conta");
    }
    //metodo de alteração do atributo de endereço
    public void mudar_endereço(String n_endereço, Pessoa individuo){
        individuo.endereco=n_endereço;
        System.out.println("o novo endereço do individuo "+individuo.nome+" é "+n_endereço);

    }
    //metodo para declarar um imovel como disponivel para venda ou aluguel
    public void disponibilizar_imv(Imoveis imovel){
        imovel.disp_alugel=true;
        imovel.disp_venda=true;
        System.out.println(" o imovel de id "+imovel.id_imovel+ " aogra esta livre");
    }
}