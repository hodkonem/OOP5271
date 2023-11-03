package lessonactor;

import lessonactor.objects.Order;
import lessonactor.objects.Person;
import lessonactor.objects.Shop;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Order order = person.makeOrder("Americano");
        System.out.println(order);
        person.payForOrder(order);
        System.out.println(order);
    }
}
