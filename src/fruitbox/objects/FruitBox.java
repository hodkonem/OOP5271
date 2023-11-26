package fruitbox.objects;

import fruitbox.interfaces.IFruit;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends IFruit> {
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        if (fruits.isEmpty()) {
            return 0.0;
        }
        double weight = 0.0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(FruitBox<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transfer(FruitBox<? super T> anotherBox) {
        if (this == anotherBox) {
            return;
        }
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
