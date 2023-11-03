import java.util.Scanner;

public abstract class Pessoa {
    Scanner scanner = new Scanner(System.in);

    //atributos de pessoa
    String nome;
    String email;
    String endereco;
    long telefone;
    String dt_nascimento;
    float renda_presumida;
    int RG;

    //construtor de pessoa
    public Pessoa (String nome,String email,String endereco,long telefone,
    String dt_nascimento,double d){

        this.nome=nome;
        this.email=email;
        this.endereco=endereco;
        this.telefone=telefone;
        this.dt_nascimento=dt_nascimento;
    }

    public Pessoa(String nome2, String email2, String endereco2, long telefone2, String dt_nascimento2, int rG2) {
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