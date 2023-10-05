public class p_fisica extends cliente {
    boolean inter_compra;
    boolean inter_alugel;

    public p_fisica(String CPF, String nome, String email, String endereço, int telefone, String dt_nascimento,
            float renda_presumida, int RG, int cnpj, boolean inter_alugel, boolean inter_compra,String comprovante_residencia) {
            super(CPF, nome, email, endereço, telefone, dt_nascimento, renda_presumida, RG, cnpj, comprovante_residencia);
                this.inter_alugel=inter_alugel;
                this.inter_compra=inter_compra;
    }
    
    
}
