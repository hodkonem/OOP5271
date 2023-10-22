package service;

import domain.Bottle;
import domain.HotDrink;
import domain.PrType;
import domain.Product;

import java.util.ArrayList;

public class MainFrame {
    private VendingMachineGUI vendingMachineGUI;
    private VendingMachineFrame vendingMachineFrame;
    private ArrayList<Product> products;
    private Holder holder;

    public void initialize() {
        PrType snack = new PrType("Snack");
        PrType chocolate = new PrType("Chocolate");
        PrType lemonade = new PrType("Lemonade");
        Product product1 = new Product("Lays", 99.99, snack);
        Product product2 = new Product("Snikers", 88.59, chocolate);
        Product product3 = new Product("Kola", 150.99, lemonade);
        Bottle bottle1 = new Bottle("Кола", 88.0, 0.5);
        Bottle bottle2 = new Bottle("Aqua", 108.0, 1.5);
        HotDrink cappuccino = new HotDrink("Cappuchino", 115, 70);
        HotDrink berryTea = new HotDrink("Berry tea", 90, 80);
        HotDrink compote = new HotDrink("Сompote", 55, 14);

        products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(bottle1);
        products.add(bottle2);
        products.add(berryTea);
        products.add(cappuccino);
        products.add(compote);

        Holder holder = new Holder(this);
        vendingMachineFrame = new VendingMachineFrame(this, holder);
        vendingMachineFrame.initialize(products);

        vendingMachineGUI = new VendingMachineGUI();
        vendingMachineGUI.initialize();
    }

    public void start() {
        // Показать главное окно
        // ...

        // Здесь можно вызвать методы и функции, связанные с главным окном
        // ...
    }

    // Метод для получения списка продуктов
    public ArrayList<Product> getProducts() {
        return products;
    }

    // Метод для взаимодействия с Holder при выборе продукта
    public void onProductSelected(Product product) {
        if (vendingMachineFrame != null) {
            Product purchasedProduct = holder.buyProduct(product);
            if (purchasedProduct != null) {
                vendingMachineFrame.showPurchaseConfirmation(purchasedProduct);
            }
        }
    }

    // Метод для взаимодействия с Holder после завершения покупки
    public void onPurchaseComplete() {
        if (vendingMachineFrame != null) {
            vendingMachineFrame.showPurchaseCompleteMessage();
        }
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.initialize();
        mainFrame.start();
    }
}