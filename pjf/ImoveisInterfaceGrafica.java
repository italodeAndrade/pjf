import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class ImoveisInterfaceGrafica extends JFrame {
    private JTextField enderecoField;
    private JTextField areaField;
    private JTextField cepField;
    private JTextField anoConstrucaoField;
    private JTextField precoField;
    private JCheckBox dispVendaCheckBox;
    private JCheckBox dispAluguelCheckBox;
    private JTextField numQuartosField;
    private JTextField vlrAluguelField;
    private JCheckBox mobiliadoCheckBox;
    private JCheckBox semiMobiliadoCheckBox;
    private JTextField idImovelField;
    private JTextField dtInicAluguelField;
    private JTextField dtFnAluguelField;
    private JButton cadastrarImovelNovoButton;
    private JButton cadastrarImovelVelhoButton;

    private List<Imovel_novo> listaImoveisNovos;
    private List<Imovel_Velho> listaImoveisVelhos;

    public ImoveisInterfaceGrafica() {
        setTitle("Cadastro de Imóveis");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(16, 2));

        enderecoField = new JTextField();
        areaField = new JTextField();
        cepField = new JTextField();
        anoConstrucaoField = new JTextField();
        precoField = new JTextField();
        dispVendaCheckBox = new JCheckBox("Disponível para venda");
        dispAluguelCheckBox = new JCheckBox("Disponível para alugar");
        numQuartosField = new JTextField();
        vlrAluguelField = new JTextField();
        mobiliadoCheckBox = new JCheckBox("Mobiliado");
        semiMobiliadoCheckBox = new JCheckBox("Semi mobiliado");
        idImovelField = new JTextField();
        dtInicAluguelField = new JTextField();
        dtFnAluguelField = new JTextField();
        cadastrarImovelNovoButton = new JButton("Cadastrar Imóvel Novo");
        cadastrarImovelVelhoButton = new JButton("Cadastrar Imóvel Velho");

        add(new JLabel("Endereço:"));
        add(enderecoField);
        add(new JLabel("Área:"));
        add(areaField);
        add(new JLabel("CEP:"));
        add(cepField);
        add(new JLabel("Ano de Construção:"));
        add(anoConstrucaoField);
        add(new JLabel("Preço:"));
        add(precoField);
        add(new JLabel()); 
        add(dispVendaCheckBox);
        add(new JLabel()); 
        add(dispAluguelCheckBox);
        add(new JLabel("Número de quartos:"));
        add(numQuartosField);
        add(new JLabel("Valor do aluguel:"));
        add(vlrAluguelField);
        add(new JLabel()); 
        add(mobiliadoCheckBox);
        add(new JLabel()); 
        add(semiMobiliadoCheckBox);
        add(new JLabel("ID do imóvel:"));
        add(idImovelField);
        add(new JLabel("Data de início do contrato:"));
        add(dtInicAluguelField);
        add(new JLabel("Data do final do contrato:"));
        add(dtFnAluguelField);
        add(new JLabel()); 
        add(cadastrarImovelNovoButton);
        add(new JLabel());
        add(cadastrarImovelVelhoButton);

        listaImoveisNovos = new ArrayList<>();
        listaImoveisVelhos = new ArrayList<>();

        cadastrarImovelNovoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String endereco = enderecoField.getText();
                double area = Double.parseDouble(areaField.getText());
                String cep = cepField.getText();
                String anoConstrucao = anoConstrucaoField.getText();
                double preco = Double.parseDouble(precoField.getText());
                boolean dispVenda = dispVendaCheckBox.isSelected();
                boolean dispAluguel = dispAluguelCheckBox.isSelected();
                int numQuartos = Integer.parseInt(numQuartosField.getText());
                double vlrAluguel = Double.parseDouble(vlrAluguelField.getText());
                boolean mobiliado = mobiliadoCheckBox.isSelected();
                boolean semiMobiliado = semiMobiliadoCheckBox.isSelected();
                int idImovel = Integer.parseInt(idImovelField.getText());
                String dtInicAluguel = dtInicAluguelField.getText();
                String dtFnAluguel = dtFnAluguelField.getText();
        
                Imovel_novo novoImovel = new Imovel_novo(area, cep, endereco, anoConstrucao, preco, dispVenda,
                        dispAluguel, numQuartos, vlrAluguel, mobiliado, semiMobiliado, idImovel, dtInicAluguel, dtFnAluguel);
        
                listaImoveisNovos.add(novoImovel);
                JOptionPane.showMessageDialog(ImoveisInterfaceGrafica.this, "Imóvel novo cadastrado com sucesso.");
                clearFields();
            }
        });
        
        cadastrarImovelVelhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String endereco = enderecoField.getText();
                double area = Double.parseDouble(areaField.getText());
                String cep = cepField.getText();
                String anoConstrucao = anoConstrucaoField.getText();
                double preco = Double.parseDouble(precoField.getText());
                boolean dispVenda = dispVendaCheckBox.isSelected();
                boolean dispAluguel = dispAluguelCheckBox.isSelected();
                int numQuartos = Integer.parseInt(numQuartosField.getText());
                double vlrAluguel = Double.parseDouble(vlrAluguelField.getText());
                boolean mobiliado = mobiliadoCheckBox.isSelected();
                boolean semiMobiliado = semiMobiliadoCheckBox.isSelected();
                int idImovel = Integer.parseInt(idImovelField.getText());
                String dtInicAluguel = dtInicAluguelField.getText();
                String dtFnAluguel = dtFnAluguelField.getText();
        
                Imovel_Velho velhoImovel = new Imovel_Velho(area, cep, endereco, anoConstrucao, preco, dispVenda,
                        dispAluguel, numQuartos, vlrAluguel, mobiliado, semiMobiliado, idImovel, dtInicAluguel, dtFnAluguel);
        
                listaImoveisVelhos.add(velhoImovel);
                JOptionPane.showMessageDialog(ImoveisInterfaceGrafica.this, "Imóvel velho cadastrado com sucesso.");
                clearFields();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Método para limpar campos
    private void clearFields() {
        enderecoField.setText("");
        areaField.setText("");
        cepField.setText("");
        anoConstrucaoField.setText("");
        precoField.setText("");
        dispVendaCheckBox.setSelected(false);
        dispAluguelCheckBox.setSelected(false);
        numQuartosField.setText("");
        vlrAluguelField.setText("");
        mobiliadoCheckBox.setSelected(false);
        semiMobiliadoCheckBox.setSelected(false);
        idImovelField.setText("");
        dtInicAluguelField.setText("");
        dtFnAluguelField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImoveisInterfaceGrafica());
    }
}

