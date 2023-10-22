package service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendingMachineGUI extends JFrame {
    private JButton buyButton;
    private JButton clearButton;

    public VendingMachineGUI() {
        setTitle("Vending Machine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        addEventListeners();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        buyButton = new JButton("Buy");
        clearButton = new JButton("Clear");

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(buyButton);
        buttonsPanel.add(clearButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(buttonsPanel, BorderLayout.CENTER);
    }

    private void addEventListeners() {
        buyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Обработчик для кнопки "Купить товар"
                // Ваш код обработки клика на кнопку "Купить товар" здесь
                // 🛒🤑
                JOptionPane.showMessageDialog(VendingMachineGUI.this, "Товар куплен!");
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Обработчик для кнопки "Очистить"
                // Ваш код обработки клика на кнопку "Очистить" здесь
                // 🧹🗑️
                JOptionPane.showMessageDialog(VendingMachineGUI.this, "Очищено!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VendingMachineGUI();
        });
    }

    public void initialize() {
        // Логика инициализации пользовательского интерфейса

        // Например:
        setupUI();
        loadProducts();
        displayWelcomeMessage();
    }

    private void setupUI() {
        // Логика настройки элементов пользовательского интерфейса (например, кнопок, текстовых полей и т.д.)
    }

    private void loadProducts() {
        // Логика загрузки списка товаров из базы данных или других источников данных
    }

    private void displayWelcomeMessage() {
        // Логика отображения приветственного сообщения на пользовательском интерфейсе
    }
}