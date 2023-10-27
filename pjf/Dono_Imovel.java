import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//declaração da classe herdada de Pessoa
public class Dono_Imovel extends Pessoa {
     int id_imovel;
     String CPF;
     String CNPJ;
     

     //contrutor
     public Dono_Imovel(String CPF, String nome, String email, String endereço, long telefone, String dt_nascimento,
               float renda_presumida, int RG, String CNPJ,int id_imovel,double saldo) {
          super(nome, email, endereço, telefone, dt_nascimento, renda_presumida, RG);
          this.id_imovel=id_imovel;
          this.CNPJ=CNPJ;
          this.CPF=CPF;
     }
     // Cadastro do dono do imovel
     public static List<Dono_Imovel>cadastrarDono_imovel(List<Dono_Imovel> listaPessoas) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Por favor, insira as informações do Fiador:");
     
          System. out.println("ID do Imovél:");
          int id_imovel = scanner.nextInt();
    
           System.out.print("CNPJ: ");
          String cnpj = scanner.nextLine();

           System.out.print("CPF: ");
          String cpf = scanner.nextLine();

          
     }
}