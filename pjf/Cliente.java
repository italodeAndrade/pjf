//declaração da classe herdada de pessoa
public abstract class Cliente extends Pessoa {
    int id_imv_c;
    public Cliente( String nome, String email, String endereco, long telefone, String dt_nascimento,
            float renda_presumida, int RG, int i) {
        super(nome, email, endereco, telefone, dt_nascimento, renda_presumida);
        this.id_imv_c=i;
    }

//Método para comprar imovél, efetua a verificação da dispinibilidade do imovél
    public void comprar_imovel(Imoveis imovel,Cliente individuo){
        imovel.disp_alugel=false;
        imovel.disp_venda=false;
        individuo.id_imv_c=imovel.id_imovel;
        imovel.comprador=individuo;
        System.out.println("o imovel com id: "+imovel.id_imovel+" foi comprado");

    }

//Método para alugar imovél, efetua a verificação de disponibilidade e do fiador
    public void alugar_imovel(Imoveis imovel,Cliente individuo){
        imovel.disp_alugel=false;
        imovel.fiador=individuo;
         individuo.id_imv_c=imovel.id_imovel;
        System.out.println("o imovel com id: "+imovel.id_imovel+" foi alugado");
    }
}