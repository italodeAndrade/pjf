public class Fiador extends Pessoa {
     int id_imovel;
     String CPF;
     String CNPJ;

     public Fiador(String CPF, String nome, String email, String endereço, int telefone, String dt_nascimento,
               float renda_presumida, int RG, String CNPJ,int id_imovel,double saldo) {
          super(nome, email, endereço, telefone, dt_nascimento, renda_presumida, RG, saldo);
          this.id_imovel=id_imovel;
          this.CNPJ=CNPJ;
          this.CPF=CPF;
     }
     
     
    
}
