public class fiador extends cliente {
     int id_imovel;

     public fiador(String CPF, String nome, String email, String endereço, int telefone, String dt_nascimento,
               float renda_presumida, int RG, int cnpj,int id_imovel,String comprovante_residencia) {
          super(CPF, nome, email, endereço, telefone, dt_nascimento, renda_presumida, RG, cnpj,comprovante_residencia);
          this.id_imovel=id_imovel;
     }
     
    
}
