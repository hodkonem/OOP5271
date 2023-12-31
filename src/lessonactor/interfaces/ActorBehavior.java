package lessonactor.interfaces;

import lessonactor.Order;

public interface ActorBehavior {
    void generateNumber();
    Order makeOrder(String string);
    void takeOrder(Order order);
    void payForOrder(Order order);
}
