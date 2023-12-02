package lesson004Solid.task4solid;

// Обобщенный класс NumericFns, который хранит числовое значение типа T.
// Принцип единственной ответственности (Single Responsibility Principle)
// класс NumericFns должен быть ответственен только за работу с числами
// и их функциями, такими как абсолютные значения и проверка равенства.
abstract class NumericFns<T extends Number> {
    protected T num;

    // Конструктор класса NumericFns, принимающий числовой объект типа T.
    NumericFns(T n) {
        this.num = n;
    }

    // Метод для возврата абсолютного значения числа.
    abstract double absValue();

    // Метод для проверки абсолютного равенства двух объектов NumericFns.
    abstract boolean absEqual(NumericFns<?> ob);
}
