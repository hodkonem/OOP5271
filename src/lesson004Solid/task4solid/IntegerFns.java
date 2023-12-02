package lesson004Solid.task4solid;

// Подкласс `IntegerFns` для класса `NumericFns`, который специализируется на работе с целыми числами.
// Принцип открытости/закрытости (Open/Closed Principle). Например, этот класс может быть расширеным
// для работы с другими числовыми типами в будущем.
public class IntegerFns extends NumericFns<Integer> {
    // Конструктор класса IntegerFns, наследующий конструктор базового класса NumericFns.
    IntegerFns(int n) {
        super(n);
    }

    // Метод для возврата абсолютного значения числа.
    @Override
    double absValue() {
        return Math.abs(num.intValue());
    }

    // Метод для проверки абсолютного равенства двух объектов NumericFns.
    @Override
    boolean absEqual(NumericFns<?> ob) {
        return this.absValue() == ob.absValue();
    }
}