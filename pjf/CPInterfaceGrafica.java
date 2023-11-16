import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class CPInterfaceGrafica {
    private static Corretor corretorAtual;
    private static Dono_Imovel donoImovelAtual;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interface Gráfica Corretor e Dono de Imóvel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel labelCorretor = new JLabel("Corretor:");
        labelCorretor.setBounds(10, 20, 80, 25);
        panel.add(labelCorretor);

        JTextField corretorTextField = new JTextField(20);
        corretorTextField.setBounds(100, 20, 165, 25);
        panel.add(corretorTextField);

        JButton cadastrarCorretorButton = new JButton("Cadastrar Corretor");
        cadastrarCorretorButton.setBounds(10, 50, 200, 25);
        panel.add(cadastrarCorretorButton);

        JLabel labelDonoImovel = new JLabel("Dono de Imóvel:");
        labelDonoImovel.setBounds(10, 80, 100, 25);
        panel.add(labelDonoImovel);

        JTextField donoImovelTextField = new JTextField(20);
        donoImovelTextField.setBounds(120, 80, 165, 25);
        panel.add(donoImovelTextField);

        JButton cadastrarDonoImovelButton = new JButton("Cadastrar Dono de Imóvel");
        cadastrarDonoImovelButton.setBounds(10, 110, 250, 25);
        panel.add(cadastrarDonoImovelButton);

        cadastrarCorretorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                corretorAtual = Corretor.cadastrarCorretor(new Scanner(System.in));
                corretorTextField.setText(corretorAtual.getNome());

                if (donoImovelAtual != null) {
                    corretorAtual.setDonoImovelResponsavel(donoImovelAtual);
                    donoImovelAtual.setCorretorResponsavel(corretorAtual);
                }
            }
        });

        cadastrarDonoImovelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                donoImovelAtual = Dono_Imovel.cadastrarDono_imovel(new Scanner(System.in));
                donoImovelTextField.setText(donoImovelAtual.getCPF());

                if (corretorAtual != null) {
                    donoImovelAtual.setCorretorResponsavel(corretorAtual);
                    corretorAtual.setDonoImovelResponsavel(donoImovelAtual);
                }
            }
        });
    }
}

class Corretor {
    private String nome;
    
    public static Corretor cadastrarCorretor(Scanner scanner) {
        System.out.println("Preencha as informações do corretor:");
        System.out.print("Nome: ");
        return new Corretor();
    }

    public String getNome() {
        return nome;
    }

    public void setDonoImovelResponsavel(Dono_Imovel donoImovel) {
        // Lógica para associar o Dono_Imovel a este Corretor
    }
}

class Dono_Imovel {
    private String CPF;

    public static Dono_Imovel cadastrarDono_imovel(Scanner scanner) {
        System.out.println("Por favor, insira as informações do Proprietário:");
        System.out.print("CPF: ");
        return new Dono_Imovel();
    }

    public String getCPF() {
        return CPF;
    }

    public void setCorretorResponsavel(Corretor corretor) {
        // Lógica para associar o Corretor a este Dono_Imovel
    }
}

