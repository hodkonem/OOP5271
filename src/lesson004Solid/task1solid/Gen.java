package lesson004Solid.task1solid;

// Обобщенный класс Gen
// Использует принцип единственной ответственности
class Gen<T> {
    private T ob;

    // Конструктор, принимающий тип данных T
    Gen(T o) {
        this.ob = o;
    }

    // Метод для получения значения типа T
    T getOb() {
        return ob;
    }

    // Метод для отображения типа данных, используемого в объекте
    void showType() {
        // Применение принципа открытости/закрытости
        System.out.println("Тип T - это " + ob.getClass().getName());
    }
}