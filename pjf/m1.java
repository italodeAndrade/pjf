import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class m1{
    public static void main (String[]args){
        List<Imovel_novo> listaImoveis_novos = new ArrayList<>();
        List<Imovel_Velho> listaImoveis_velhos = new ArrayList<>();

        Imovel_Velho.cadastrar_Imovel_Velho(listaImoveis_velhos);
        Imovel_novo.cadastrar_Imovel_novo(listaImoveis_novos);
    
        System.out.println(listaImoveis_novos.toString());
        System.out.println(listaImoveis_velhos.toString());   
    }

}
