package interfaces;

import domain.Product;

import javax.swing.*;
import java.util.List;

public interface IVendingMachine {
    List<Product> getProducts();
    IProductCalculator getCalculator();
    JList<Product> getProductList();
    JTextField getMoneyField();
    JButton getBuyButton();

    void initUI();
}