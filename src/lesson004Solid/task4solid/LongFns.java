package lesson004Solid.task4solid;

// Подкласс `LongFns` для класса `NumericFns`, который специализируется на работе с числами, представляемыми типом Long.
public class LongFns extends NumericFns<Long> {
    // Конструктор класса LongFns, наследующий конструктор базового класса NumericFns.
    LongFns(long n) {
        super(n);
    }

    // Метод для возврата абсолютного значения числа.
    @Override
    double absValue() {
        return Math.abs(num.longValue());
    }

    // Метод для проверки абсолютного равенства двух объектов NumericFns.
    @Override
    boolean absEqual(NumericFns<?> ob) {
        return this.absValue() == ob.absValue();
    }
}