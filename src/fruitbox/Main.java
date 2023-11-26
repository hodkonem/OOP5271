package fruitbox;

import fruitbox.objects.Apple;
import fruitbox.objects.Banana;
import fruitbox.objects.FruitBox;
import fruitbox.objects.Orange;

public class Main {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.addFruit(new Apple(0.1));
        appleBox.addFruit(new Apple(0.2));
        System.out.printf("Apple box weight: %.2f%n\n", appleBox.getWeight());

        FruitBox<Orange> orangeBox = new FruitBox<>();
        orangeBox.addFruit(new Orange(0.3));
        orangeBox.addFruit(new Orange(0.4));
        System.out.println("Orange box weight: " + orangeBox.getWeight());

        FruitBox<Banana> bananaBox = new FruitBox<>();
        bananaBox.addFruit(new Banana(0.2));
        bananaBox.addFruit(new Banana(0.3));
        System.out.println("Banana box weight: " + bananaBox.getWeight());
    }
}
