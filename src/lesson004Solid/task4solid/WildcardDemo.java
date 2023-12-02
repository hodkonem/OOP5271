package lesson004Solid.task4solid;

// ����� `WildcardDemo` ��� �������� � ������ �������� NumericFns.
// ������� ����������� ������� ������ (Liskov Substitution Principle):
// ������� � ��������� ����� ���� �������� �� ���������� �� �������� ��� ��������� ������������ ���������.
//������� ����������� ������� ������ (Liskov Substitution Principle): ������� � ��������� ����� ���� ��������
// �� ���������� �� �������� ��� ��������� ������������ ���������.
public class WildcardDemo {
    public static void main(String[] args) {
        // �������� �������� NumericFns � ������� ��������� ������.
        NumericFns<Integer> iOb = new IntegerFns(5);
        NumericFns<Double> dOb = new DoubleFns(-6.0);
        NumericFns<Long> lOb = new LongFns(5L);

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

        // ����� ����� �������� �������������� ��� ��� ������������ ������ ������� ������� `NumericFns` � `WildcardDemo`.
    }
}