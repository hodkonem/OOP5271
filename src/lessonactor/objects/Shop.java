package lessonactor.objects;

import domain.Bottle;
import domain.HotDrink;
import domain.PrType;
import domain.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Shop implements Iterable<Product> {
    protected String nameShop;
    protected static List<Product> products;

    public Shop(String name) {
        this.nameShop = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public String getNameShop() {
        return nameShop;
    }

    public abstract int getProductsCount();

    public Iterator<Product> productIterator() {
        return new IteratorProduct(products);
    }

    public static List<Product> buildShopWithProducts() {
        PrType prType = new PrType("Snack");
        Product product1 = new Product("Snickers", 33.45, prType);
        Product product2 = new Product("Nuts", 10.15, prType);
        Product product3 = new Product("Lays", 99.99, prType);

        Bottle bottle = new Bottle("Aqua", 88.0, 9.5);
        HotDrink hotDrink1 = new HotDrink("Americano", 110, 80);
        HotDrink hotDrink2 = new HotDrink("Italiano", 110, 69);

        List<Product> products = new ArrayList<>();
        Shop.products = products;
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(bottle);
        products.add(hotDrink1);
        products.add(hotDrink2);
        return products;
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static Order addOrder(String name) {
        Shop.buildShopWithProducts();
        String nameOrder = name;
        for (Product product : products) {
            if (product.getName().equals(nameOrder)) {
                Order order = new Order(List.of(product), product.getPrice(), false, false);
                return order;
            }
        }
        return null;
    }
}
