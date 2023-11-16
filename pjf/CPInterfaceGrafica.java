import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CPInterfaceGrafica {
    private static String nomeCorretor;
    private static String cpfDonoImovel;

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
                nomeCorretor = JOptionPane.showInputDialog("Informe o nome do corretor:");
                corretorTextField.setText(nomeCorretor);

                if (cpfDonoImovel != null) {
                    JOptionPane.showMessageDialog(null, "Corretor cadastrado com sucesso e associado ao Dono de Imóvel.");
                }
            }
        });

        cadastrarDonoImovelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cpfDonoImovel = JOptionPane.showInputDialog("Informe o CPF do dono do imóvel:");
                donoImovelTextField.setText(cpfDonoImovel);

                if (nomeCorretor != null) {
                    JOptionPane.showMessageDialog(null, "Dono de Imóvel cadastrado com sucesso e associado ao Corretor.");
                }
            }
        });
    }
}


