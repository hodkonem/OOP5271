package lessonactor;

import domain.PrType;
import domain.Product;
import lessonactor.objects.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shop> shops = new ArrayList<>();

        PrType bakery = new PrType("выпечка");
        PrType drink = new PrType("напитки");
        PrType spice = new PrType("специи");
        PrType groats = new PrType("крупа");
        PrType meat = new PrType("Мясо");

        // Create supermarkets
        Supermarket supermarket1 = new Supermarket("Магнит", 10);
        supermarket1.addProduct(new Product("Хлеб", 50, bakery));
        supermarket1.addProduct(new Product("Молоко", 70, drink));
        supermarket1.addProduct(new Product("Пшено", 70, groats));
        supermarket1.addProduct(new Product("Свинина", 70, meat));
        shops.add(supermarket1);

        Supermarket supermarket2 = new Supermarket("Пятерочка", 5);
        supermarket2.addProduct(new Product("Сахар", 30, spice));
        supermarket2.addProduct(new Product("Соль", 20, spice));
        supermarket2.addProduct(new Product("макаронные изделия", 20, bakery));
        shops.add(supermarket2);

        Supermarket supermarket3 = new Supermarket("FixPrice", 3);
        supermarket3.addProduct(new Product("Чай", 40, drink));
        supermarket3.addProduct(new Product("Кофе", 100, drink));
        shops.add(supermarket3);

        // Create StreamService to sort shops
        StreamService streamService = new StreamService();
        streamService.sortShops(shops);

        // Compare the quantity of products using StreamComparator
        StreamComparator comparator = new StreamComparator();
        Shop shopWithMostProducts = Collections.max(shops, comparator);
        Shop shopWithLeastProducts = Collections.min(shops, comparator);

        // Output the results
        System.out.println("Магазин с наибольшим количеством товаров: " + shopWithMostProducts.getNameShop() + " - " + shopWithMostProducts.getProductsCount() + " products");
        System.out.println("Магазин с наименьшим количеством товаров: " + shopWithLeastProducts.getNameShop() + " - " + shopWithLeastProducts.getProductsCount() + " products");

        // Additional functionality
        Person person = new Person();
        Order order = person.makeOrder("Americano");
        System.out.println(order);
        person.payForOrder(order);
        System.out.println(order);
        person.takeOrder(order);
        System.out.println(order);
    }
}