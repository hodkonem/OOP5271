package lessonactor.objects;

import lessonactor.Order;
import lessonactor.interfaces.ActorBehavior;

public abstract class Actor implements ActorBehavior {

    boolean isTakeOrder;
    boolean isSetOrder;

    int age;
    int money;

    public Actor() {
    }

    public Actor(boolean isTakeOrder, boolean isSetOrder, int age, int money) {
        this.isTakeOrder = isTakeOrder;
        this.isSetOrder = isSetOrder;
        this.age = age;
        this.money = money;
    }

    // методы-действия

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    public boolean isSetOrder() {
        return isSetOrder;
    }

    public void setSetOrder(boolean setOrder) {
        isSetOrder = setOrder;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public abstract void takeOrder(Order order);
}
