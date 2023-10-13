public class P_juridica extends Cliente {
    boolean inter_compra;
    boolean inter_alugel;
    String cnpj;
    public P_juridica(String nome, String email, String endereço, int telefone, String dt_nascimento,
            float renda_presumida, int RG, String cnpj, boolean inter_alugel, boolean inter_compra,double saldo) {
            super(nome, email, endereço, telefone, dt_nascimento, renda_presumida, RG,saldo);
                this.inter_alugel=inter_alugel;
                this.inter_compra=inter_compra;
                this.cnpj=cnpj;
    }
    
}
