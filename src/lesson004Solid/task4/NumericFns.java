package lesson004Solid.task4;

// ���������� ����� NumericFns, ������� ������ �������� �������� ���� T.
class NumericFns<T extends Number> {
    T num;

    // ����������� ������ NumericFns, ����������� �������� ������ ���� T.
    NumericFns(T n) {
        num = n;
    }

    // ����� ��� �������� ����������� �������� �����.
    double absValue() {
        return Math.abs(num.doubleValue());
    }

    // �������� ����������� ��������� ���� �������� NumericFns.
    boolean absEqual(NumericFns<?> ob) {
        return this.absValue() == ob.absValue();
    }
}
