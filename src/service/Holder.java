package service;

import domain.Product;
import java.util.ArrayList;
import java.util.List;

public class Holder {
    private List<Product> products;

    public Holder() {
        this.products = new ArrayList<>();
    }

    public Holder(MainFrame mainFrame) {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean canBuyProduct(Product product) {
        if (products != null) {
            return products.contains(product);
        } else {
            return false;
        }
    }

    public Product buyProduct(Product product) {
        // Ваши текущие действия по покупке продукта

        return product; // Возвращаем купленный продукт
    }

    public void onProductSelected(Product selectedProduct) {
        if (canBuyProduct(selectedProduct)) {
            buyProduct(selectedProduct);
            // Дополнительные действия после покупки продукта
        } else {
            // Действия, если продукт не может быть куплен
        }
    }

    public void initialize(ArrayList<Product> products) {
        this.products.clear();
        this.products.addAll(products);
    }
}