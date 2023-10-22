package service;

import domain.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class VendingMachineFrame extends JFrame {
    private JList<Product> productList;
    private JTextField moneyField;
    private JButton buyButton;
    private MainFrame mainFrame;
    private Holder holder;
    private CoinDispenser coinDispenser;
    private JTextArea purchasedItemsTextArea;
    private JButton clearButton;

    public VendingMachineFrame(MainFrame mainFrame, Holder holder) {
        this.mainFrame = mainFrame;
        this.holder = holder;
    }

    public void initialize(List<Product> products) {
        createComponents();
        addComponents();
        setupListeners();
        populateProducts(products);

        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createComponents() {
        // Создаем компоненты интерфейса
        DefaultListModel<Product> productModel = new DefaultListModel<>();
        productList = new JList<>(productModel);
        productList.setFont(new Font("Segoe Print", Font.BOLD, 18));

        moneyField = new JTextField();
        moneyField.setFont(new Font("Segoe Print", Font.BOLD, 18));

        buyButton = new JButton("Купить товар");
        buyButton.setFont(new Font("Segoe Print", Font.BOLD, 18));

        purchasedItemsTextArea = new JTextArea();
        purchasedItemsTextArea.setFont(new Font("Segoe Print", Font.BOLD, 18));
        purchasedItemsTextArea.setEditable(false);

        clearButton = new JButton("Очистить");
        clearButton.setFont(new Font("Segoe Print", Font.BOLD, 18));
    }

    private void addComponents() {
        // Добавляем компоненты на форму
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(new JScrollPane(productList), BorderLayout.CENTER);
        topPanel.add(moneyField, BorderLayout.SOUTH);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(buyButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        add(mainPanel);

        JPanel sidePanel = new JPanel(new BorderLayout());
        sidePanel.setPreferredSize(new Dimension(200, getHeight()));

        sidePanel.add(new JScrollPane(purchasedItemsTextArea), BorderLayout.CENTER);
        sidePanel.add(clearButton, BorderLayout.SOUTH);

        mainPanel.add(sidePanel, BorderLayout.EAST);
    }

    private void setupListeners() {
        // Настраиваем обработчики событий
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Обработчик события кнопки "Купить товар"
                Product selectedProduct = productList.getSelectedValue();
                if (selectedProduct == null) {
                    JOptionPane.showMessageDialog(VendingMachineFrame.this,
                            "Выберите продукт для покупки",
                            "Ошибка",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Вызываем метод владельца (service.MainFrame) для обработки покупки товара
                holder.onProductSelected(selectedProduct);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Обработчик события кнопки "Очистить"
                purchasedItemsTextArea.setText("");
            }
        });
    }

    private void populateProducts(List<Product> products) {
        // Заполняем список продуктов на форме
        DefaultListModel<Product> productModel = (DefaultListModel<Product>) productList.getModel();
        for (Product product : products) {
            productModel.addElement(product);
        }
    }

    public void showPurchaseConfirmation(Product product) {
        String confirmationMessage = "Вы купили " + product.getName() + " за " + product.getPrice() + " руб.";
        JOptionPane.showMessageDialog(this, confirmationMessage, "Подтверждение покупки", JOptionPane.INFORMATION_MESSAGE);
        purchasedItemsTextArea.append(product.getName() + " - " + product.getPrice() + " руб." + "\n");
    }

    public void showPurchaseCompleteMessage() {
        String message = "Покупка завершена. Спасибо!";
        String[] options = {"OK"};
        JOptionPane.showOptionDialog(this, message, "Выполнено", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    }
}