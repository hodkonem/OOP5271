package lesson004Solid.task4;

public class WildcardDemo {
    public static void main(String[] args) {
        // �������� �������� NumericFns � ������� ��������� ������.
        NumericFns<Integer> iOb = new NumericFns<>(5);
        NumericFns<Double> dOb = new NumericFns<>(-6.0);
        NumericFns<Long> lOb = new NumericFns<>(5L);

        System.out.println("��������� iOb � dOb:");
        if (iOb.absEqual(dOb)) {
            System.out.println("���������� �������� ���������.");
        } else {
            System.out.println("���������� �������� ����������.");
        }

        System.out.println("\n��������� iOb � lOb:");
        if (iOb.absEqual(lOb)) {
            System.out.println("���������� �������� ���������.");
        } else {
            System.out.println("���������� �������� ����������.");
        }
    }
}

