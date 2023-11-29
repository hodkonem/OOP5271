package lessonactor;

import lessonactor.objects.Actor;

public class Person extends Actor {
    @Override
    public void generateNumber() {

    }

    @Override
    public Order makeOrder(String productName) {
        return Shop.addOrder(productName);
    }

    @Override
    public void takeOrder(Order order) {
        order.setReady(true);
        System.out.println("Забрать заказ");
    }

    @Override
    public void payForOrder(Order order) {
        order.setPaid(true);
    }
}
