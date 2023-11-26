package fruitbox.objects;

import fruitbox.interfaces.IFruit;

public class Banana implements IFruit {
    private final double weight;

    public Banana(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
