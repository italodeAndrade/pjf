import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class MainInterfaceGrafica extends JFrame {
    private JTextField cpfCnpjField;
    private JTextField nomeField;
    private JTextField emailField;
    private JTextField enderecoField;
    private JTextField telefoneField;
    private JTextField dtNascimentoField;
    private JTextField rendaPresumidaField;
    private JCheckBox interesseCompraCheckBox;
    private JCheckBox interesseAluguelCheckBox;
    private JButton cadastrarButton;

    // Listas para armazenar clientes pessoa física e pessoa jurídica
    private List<P_fisica> listaClientesPF;
    private List<P_juridica> listaClientesPJ;

    public MainInterfaceGrafica() {
        setTitle("Cadastro de Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(12, 2));

        cpfCnpjField = new JTextField();
        nomeField = new JTextField();
        emailField = new JTextField();
        enderecoField = new JTextField();
        telefoneField = new JTextField();
        dtNascimentoField = new JTextField();
        rendaPresumidaField = new JTextField();
        interesseCompraCheckBox = new JCheckBox("Interesse em Compra");
        interesseAluguelCheckBox = new JCheckBox("Interesse em Aluguel");
        cadastrarButton = new JButton("Cadastrar");

        add(new JLabel("CPF/CNPJ:"));
        add(cpfCnpjField);
        add(new JLabel("Nome/Razão Social:"));
        add(nomeField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Endereço:"));
        add(enderecoField);
        add(new JLabel("Telefone:"));
        add(telefoneField);
        add(new JLabel("Data de Nascimento/Fundação:"));
        add(dtNascimentoField);
        add(new JLabel("Renda Presumida:"));
        add(rendaPresumidaField);
        add(new JLabel()); 
        add(interesseCompraCheckBox);
        add(new JLabel()); 
        add(interesseAluguelCheckBox);
        add(new JLabel()); 
        add(cadastrarButton);

        listaClientesPF = new ArrayList<>();
        listaClientesPJ = new ArrayList<>();

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpfCnpj = cpfCnpjField.getText();
                String nome = nomeField.getText();
                String email = emailField.getText();
                String endereco = enderecoField.getText();
                long telefone = Long.parseLong(telefoneField.getText());
                String dtNascimento = dtNascimentoField.getText();
                float rendaPresumida = Float.parseFloat(rendaPresumidaField.getText());
                boolean interCompra = interesseCompraCheckBox.isSelected();
                boolean interAluguel = interesseAluguelCheckBox.isSelected();

                if (cpfCnpj.length() == 11) { // Verifica se é CPF (11 dígitos)
                    P_fisica clienteFisico = new P_fisica(cpfCnpj, nome, email, endereco, telefone,
                            dtNascimento, rendaPresumida, 0, interAluguel, interCompra);

                    listaClientesPF.add(clienteFisico);
                    JOptionPane.showMessageDialog(MainInterfaceGrafica.this, "Cliente pessoa física cadastrado com sucesso.");
                } else if (cpfCnpj.length() == 14) { // Verifica se é CNPJ (14 dígitos)
                    P_juridica clienteJuridico = new P_juridica(nome, email, endereco, telefone,
                            dtNascimento, rendaPresumida, cpfCnpj, interAluguel, interCompra, 0);

                    listaClientesPJ.add(clienteJuridico);
                    JOptionPane.showMessageDialog(MainInterfaceGrafica.this, "Cliente pessoa jurídica cadastrado com sucesso.");
                } else {
                    JOptionPane.showMessageDialog(MainInterfaceGrafica.this, "CPF ou CNPJ inválido.");
                }

                clearFields();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void clearFields() {
        cpfCnpjField.setText("");
        nomeField.setText("");
        emailField.setText("");
        enderecoField.setText("");
        telefoneField.setText("");
        dtNascimentoField.setText("");
        rendaPresumidaField.setText("");
        interesseCompraCheckBox.setSelected(false);
        interesseAluguelCheckBox.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainInterfaceGrafica());
    }
}














