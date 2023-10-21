import domain.Bottle;
import domain.PrType;
import domain.Product;
import service.CoinDispanser;
import service.Holder;
import service.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrType snack = new PrType("Snack");
        PrType chocolate = new PrType("Chocolate");
        PrType lemonade = new PrType("Lemonade");
        Product product1 = new Product("Lays", 99.99, snack);
        Product product2 = new Product("Snikers", 88.59, chocolate);
        Product product3 = new Product("Kola", 150.99, lemonade);
        Bottle bottle1 = new Bottle("Кола", 88.0, 0.5);
        Bottle bottle2 = new Bottle("Aqua", 108.0, 1.5);


        List<Product> products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(bottle1);
        products.add(bottle2);


        Holder holder = new Holder();
        CoinDispanser coinDispanser = new CoinDispanser();

        VendingMachine vendingMachine = new VendingMachine(holder, coinDispanser, products);

//        for (Product prod : products) {
//            System.out.println(prod);
//        }

        for (Product prod : vendingMachine.getProductList()) {
            System.out.println(prod);
        }

    }
}
