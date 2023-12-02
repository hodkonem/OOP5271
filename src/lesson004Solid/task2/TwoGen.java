package lesson004Solid.task2solid;

// Обобщенный класс TwoGen
// Использует принцип единственной ответственности
class TwoGen<T, V> {
    private T ob1;
    private V ob2;

    // Конструктор класса, принимающий два аргумента типов T и V
    TwoGen(T o1, V o2) {
        this.ob1 = o1;
        this.ob2 = o2;
    }

    // Метод для отображения типов T и V
    void showTypes() {
        // Применение принципа открытости/закрытости
        System.out.println("Тип T - это " + ob1.getClass().getName());
        System.out.println("Тип V - это " + ob2.getClass().getName());
    }

    // Методы для получения объектов типов T и V
    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}