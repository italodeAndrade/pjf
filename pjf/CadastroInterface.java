import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroInterface extends JFrame {
    private JTextField nomeField, emailField, enderecoField, telefoneField, dtNascimentoField, rendaField;
    private ArrayList<String> Cliente = new ArrayList<>();

    public CadastroInterface() {
        setTitle("Cadastro");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Nome:"), gbc);
        gbc.gridx = 1;
        nomeField = new JTextField(20);
        panel.add(nomeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        emailField = new JTextField(20);
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Endereço:"), gbc);
        gbc.gridx = 1;
        enderecoField = new JTextField(20);
        panel.add(enderecoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Telefone:"), gbc);
        gbc.gridx = 1;
        telefoneField = new JTextField(20);
        panel.add(telefoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Data de Nascimento:"), gbc);
        gbc.gridx = 1;
        dtNascimentoField = new JTextField(20);
        panel.add(dtNascimentoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(new JLabel("Renda Presumida:"), gbc);
        gbc.gridx = 1;
        rendaField = new JTextField(20);
        panel.add(rendaField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String email = emailField.getText();
                String endereco = enderecoField.getText();
                String telefone = telefoneField.getText();
                String dtNascimento = dtNascimentoField.getText();
                String renda = rendaField.getText();

                String cadastroInfo = "Nome: " + nome + "\nEmail: " + email + "\nEndereço: " +
                        endereco + "\nTelefone: " + telefone + "\nData de Nascimento: " +
                        dtNascimento + "\nRenda Presumida: " + renda;

                Cliente.add(cadastroInfo);
                JOptionPane.showMessageDialog(CadastroInterface.this, cadastroInfo, "Cadastro Efetuado", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(cadastrarButton, gbc);

        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CadastroInterface cadastroInterface = new CadastroInterface();
                cadastroInterface.setVisible(true);
            }
        });
    }
}
