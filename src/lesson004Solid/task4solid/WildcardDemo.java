package lesson004Solid.task4solid;

// Класс `WildcardDemo` для создания и вывода объектов NumericFns.
// Принцип подстановки Барбары Лисков (Liskov Substitution Principle):
// Объекты в программе могут быть заменены на экземпляры их подтипов без изменения правильности программы.
//Принцип подстановки Барбары Лисков (Liskov Substitution Principle): Объекты в программе могут быть заменены
// на экземпляры их подтипов без изменения правильности программы.
public class WildcardDemo {
    public static void main(String[] args) {
        // Создание объектов NumericFns с разными числовыми типами.
        NumericFns<Integer> iOb = new IntegerFns(5);
        NumericFns<Double> dOb = new DoubleFns(-6.0);
        NumericFns<Long> lOb = new LongFns(5L);

        System.out.println("Сравнение iOb и dOb:");
        if (iOb.absEqual(dOb)) {
            System.out.println("Абсолютные значения совпадают.");
        } else {
            System.out.println("Абсолютные значения отличаются.");
        }

        System.out.println("\nСравнение iOb и lOb:");
        if (iOb.absEqual(lOb)) {
            System.out.println("Абсолютные значения совпадают.");
        } else {
            System.out.println("Абсолютные значения отличаются.");
        }

        // Здесь можно добавить дополнительный код для тестирования других функций классов `NumericFns` и `WildcardDemo`.
    }
}