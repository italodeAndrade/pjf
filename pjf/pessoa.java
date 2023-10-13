public class Pessoa {
  
    String nome;
    String email;
    String endereço;
    int telefone;
    String dt_nascimento;
    float renda_presumida;
    int RG;
    double saldo;
    double poupança;

    public Pessoa (String nome,String email,String endereço,int telefone,
    String dt_nascimento,float renda_presumida,int RG,double saldo){

        this.nome=nome;
        this.email=email;
        this.endereço=endereço;
        this.telefone=telefone;
        this.dt_nascimento=dt_nascimento;
        this.renda_presumida=renda_presumida;

        this.saldo = saldo;

    }

    public void comprar_imovel(Imoveis imovel,Pessoa individuo){
        
        imovel.disp_alugel=false;
        imovel.disp_venda=false;
        imovel.comprador=individuo;
        System.out.println("o imovel com id: "+imovel.id_imovel+" foi comprado");

    }

    public void alugar_imovel(Imoveis imovel,Pessoa individuo){
        imovel.disp_alugel=false;
        imovel.fiador=individuo;
        System.out.println("o imovel com id: "+imovel.id_imovel+" foi alugado");
    }

    public void depositar_salario(double valor){
        saldo+=valor;
        System.out.println("foi adicionado "+valor+" a conta");
    }

    public void mudar_endereço(String n_endereço, Pessoa individuo){
        individuo.endereço=n_endereço;
        System.out.println("o novo endereço do individuo "+individuo.nome+" é "+n_endereço);

    }

    public void dispo_imovel(Imoveis imovel){
        imovel.disp_alugel=true;
        imovel.disp_venda=true;
    }

}
