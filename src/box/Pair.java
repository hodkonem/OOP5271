package box;

/**
 * Комментарии использую согласно ТЗ:
 * Здесь создан обобщенный класс Pair, представляющий собой пару объектов.
 * Этот класс должен иметь два поля для хранения объектов и соответствующие геттеры и сеттеры.
 */
public class Pair<T> {
    /*
    Здесь применяем два поля
     */
    private T first;
    private T second;

    /* Здесь создаем гетеры и сеттеры
         */

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
