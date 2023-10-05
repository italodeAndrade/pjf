public class corretor extends pessoa {
    double comissão;

    public corretor(String CPF, String nome, String email, String endereço, int telefone, String dt_nascimento,
            float renda_presumida, int RG, int cnpj,double comissão,String comprovante_residencia) {
        super(CPF, nome, email, endereço, telefone, dt_nascimento, renda_presumida, RG, cnpj, comprovante_residencia);
        this.comissão=comissão;
        
    }
    
}
