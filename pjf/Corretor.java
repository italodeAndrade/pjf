import java.util.Scanner;
import java.util.List;

public class Corretor extends Pessoa {
    double comissão;

    // Construtor
    public Corretor( String nome, String email, String endereço, long telefone, String dt_nascimento,
            float renda_presumida, int RG,double comissão,double saldo) {
        super(nome, email, endereço, telefone, dt_nascimento, renda_presumida, RG);
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por Favor, Insira o valor do seu saldo:");
        double saldo = scanner.nextDouble();
        saldo+=comissão;
        System.out.println("foi depositado "+comissão+" na conta do corretor "+nome);
    }
}
