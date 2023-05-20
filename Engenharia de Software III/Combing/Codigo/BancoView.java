package com.mycompany.combing2;
/**
 *
 * @author diego
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BancoView extends JFrame {
    private ContaBancaria conta;
    private JLabel saldoLabel;

    public BancoView() {
        super("Banco");

        // Criação da conta e associação com os observadores
        conta = new ContaBancaria();
        Observador saldoObserver = new Observador() {
            public void atualizar(double saldo) {
                saldoLabel.setText("Saldo atual: R$" + saldo);
            }
        };
        conta.adicionarObservador(saldoObserver);

        // Configurações da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 200));
        setLayout(new FlowLayout());

        // Componentes da interface
        saldoLabel = new JLabel("Saldo atual: R$0.00");
        JButton depositarButton = new JButton("Depositar");
        JButton sacarButton = new JButton("Sacar");

        // Ações dos botões
        depositarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
                conta.depositar(valor);
            }
        });

        sacarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
                conta.sacar(valor);
            }
        });

        // Adição dos componentes à janela
        add(saldoLabel);
        add(depositarButton);
        add(sacarButton);

        // Exibição da janela
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}