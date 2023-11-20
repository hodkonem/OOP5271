package box;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Box с целым числом
        Box<Integer> intBox = new Box<>();
        intBox.setObject(42);
        intBox.printBoxContents();

        // Создание объекта Box со строкой
        Box<String> stringBox = new Box<>();
        stringBox.setObject("Hello, World!");
        stringBox.printBoxContents();

        // Создание объекта Pair с двумя строками
        Pair<String> stringPair = new Pair<>("foo", "bar");
        System.out.println("До замены: " + stringPair.getFirst() + ", " + stringPair.getSecond());
        swapPairs(stringPair);
        System.out.println("После замены: " + stringPair.getFirst() + ", " + stringPair.getSecond());
    }

        // Метод swapPairs меняет элементы в каждой паре местами
    public static <T> void swapPairs(Pair<T> pair) {
        T temp = pair.getFirst();
        pair.setFirst(pair.getSecond());
        pair.setSecond(temp);
    }
}
