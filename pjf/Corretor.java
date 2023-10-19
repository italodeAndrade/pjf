public class Corretor extends Pessoa {
    double comissão;
    public Corretor( String nome, String email, String endereço, int telefone, String dt_nascimento,
            float renda_presumida, int RG,double comissão,double saldo) {
        super(nome, email, endereço, telefone, dt_nascimento, renda_presumida, RG,saldo);
        this.comissão=comissão;
        
    }
    //Calcula o valor da comissão referente ao valor final da venda do imovel
    public void calcular_comissao(double valor, Imoveis Imovel){
        comissão = Imovel.calcular_valor_imovel() * 0.02;
        comissão += valor;
        System.out.println(nome+"recebeu a a sua comissão de "+comissão +" reais");
    }


    //Soma o salario ao saldo total
    public void depositar_salario(double salario){
        saldo+=comissão;
        System.out.println("foi depositado "+comissão+" na conta do corretor "+nome);
    }
}
