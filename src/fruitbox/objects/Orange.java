package fruitbox.objects;

import fruitbox.interfaces.IFruit;

public class Orange implements IFruit {
    private final double weight;

    public Orange(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}