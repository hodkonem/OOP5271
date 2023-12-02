package lesson004Solid.task4solid;

// Подкласс `DoubleFns` для класса `NumericFns`, который специализируется на работе с числами с плавающей точкой.
public class DoubleFns extends NumericFns<Double> {
    // Конструктор класса DoubleFns, наследующий конструктор базового класса NumericFns.
    DoubleFns(double n) {
        super(n);
    }

    // Метод для возврата абсолютного значения числа.
    @Override
    double absValue() {
        return Math.abs(num.doubleValue());
    }

    // Метод для проверки абсолютного равенства двух объектов NumericFns.
    @Override
    boolean absEqual(NumericFns<?> ob) {
        return this.absValue() == ob.absValue();
    }
}