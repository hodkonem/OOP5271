package lesson004Solid.task3;

public class BoundsDemo {
    public static void main(String[] args) {
        // Создание объекта Pair с двумя Integer значениями.
        Pair<Integer, Integer> pair1 = new Pair<>(1, 2);
        System.out.println("First: " + pair1.getFirst() + ", Second: " + pair1.getSecond());

        // Создание объекта Pair с NumЬer и его подклассом Integer.
        Pair<Number, Integer> pair2 = new Pair<>(3.14, 42);
        System.out.println("First: " + pair2.getFirst() + ", Second: " + pair2.getSecond());

        // Следующая строка кода вызовет ошибку компиляции, так как String не является
        // подклассом Number, что не соответствует ограничению типа.
//         Pair<Number, String> pair3 = new Pair<>(2.71, "Hello");

        // Создание объекта Pair с двумя Double значениями.
        Pair<Double, Double> pair4 = new Pair<>(2.5, 3.7);
        System.out.println("First: " + pair4.getFirst() + ", Second: " + pair4.getSecond());
    }
}