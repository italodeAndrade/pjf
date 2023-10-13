public class Corretor extends Pessoa {
    double comissão;

    public Corretor( String nome, String email, String endereço, int telefone, String dt_nascimento,
            float renda_presumida, int RG,double comissão,double saldo) {
        super(nome, email, endereço, telefone, dt_nascimento, renda_presumida, RG,saldo);
        this.comissão=comissão;
        
    }

    public void receber_comissao(double valor){
        comissão+= valor;
        System.out.println(nome+"recebeu a a sua comissão de "+comissão +" reais");
    }
    
    public void depositar_salario(double salario){
        saldo+=comissão;
        System.out.println("foi depositado "+comissão+" na conta do corretor "+nome);
    }
}
