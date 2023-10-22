import domain.Bottle;
import domain.HotDrink;
import domain.PrType;
import domain.Product;
import service.CoinDispenser;
import service.Holder;
import service.MainFrame;
import service.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static List<Product> products;

    public static List<Product> getProducts() {
        return products;
    }

    public static void main(String[] args) {

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
// Добавление продуктов в список products
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(bottle1);
        products.add(bottle2);
        products.add(berryTea);
        products.add(cappuccino);
        products.add(compote);

        Holder hold1 = new Holder();
        CoinDispenser dispanser = new CoinDispenser();

        VendingMachine venMach1 = new VendingMachine(hold1, dispanser, products);

        for (Product prod : venMach1.getProductList()) {
            System.out.println(prod);
        }

        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
