//declaração da classe herdada de cliente
public class P_fisica extends Cliente {
    boolean inter_compra;
    boolean inter_alugel;
    String cpf;

    //construtor
    public P_fisica(String cpf, String nome, String email, String endereço, long telefone, String dt_nascimento,
            float renda_presumida, int RG, boolean inter_alugel, boolean inter_compra,double saldo, int id_imv_c) {
            super(nome, email, endereço, telefone, dt_nascimento, renda_presumida, RG,saldo,id_imv_c);
                this.inter_alugel=inter_alugel;
                this.inter_compra=inter_compra;
    }
    
    
}
