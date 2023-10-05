public class pessoa {
    String CPF;
    String nome;
    String email;
    String endereço;
    int telefone;
    String dt_nascimento;
    float renda_presumida;
    int RG;
    int cnpj;
    String comprovante_residencia;
    public pessoa (String CPF, String nome,String email,String endereço,int telefone,
    String dt_nascimento,float renda_presumida,int RG,int cnpj, String comprovante_residencia){
        this.comprovante_residencia=comprovante_residencia;
        this.CPF=CPF;
        this.nome=nome;
        this.email=email;
        this.endereço=endereço;
        this.telefone=telefone;
        this.dt_nascimento=dt_nascimento;
        this.renda_presumida=renda_presumida;
        this.cnpj=cnpj;
        
    }

}
