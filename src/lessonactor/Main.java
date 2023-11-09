package lessonactor;

import lessonactor.objects.*;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Shop.buildShopWithProducts();
        Collections.sort(Shop.getProducts());

        IteratorProduct iteratorProduct = new IteratorProduct(Shop.getProducts());

        while (iteratorProduct.hasNext()) {
            System.out.println(iteratorProduct.next());
        }
Shop.getProducts().sort(new ProductComparatorByName());
        System.out.println(Shop.getProducts());

        Person person = new Person();
        Order order = person.makeOrder("Americano");
        System.out.println(order);
        person.payForOrder(order);
        System.out.println(order);
        person.takeOrder(order);
        System.out.println(order);
    }
}
