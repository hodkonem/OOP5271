package fruitbox.objects;

import fruitbox.interfaces.IFruit;

public class Apple implements IFruit {
    private final double weight;

    public Apple(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
