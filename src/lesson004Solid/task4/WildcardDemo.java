package lesson004Solid.task4;

public class WildcardDemo {
    public static void main(String[] args) {
        // Создание объектов NumericFns с разными числовыми типами.
        NumericFns<Integer> iOb = new NumericFns<>(5);
        NumericFns<Double> dOb = new NumericFns<>(-6.0);
        NumericFns<Long> lOb = new NumericFns<>(5L);

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
    }
}

