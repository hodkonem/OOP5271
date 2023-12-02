package lesson004Solid.task4solid;

// ���������� ����� NumericFns, ������� ������ �������� �������� ���� T.
// ������� ������������ ��������������� (Single Responsibility Principle)
// ����� NumericFns ������ ���� ������������ ������ �� ������ � �������
// � �� ���������, ������ ��� ���������� �������� � �������� ���������.
abstract class NumericFns<T extends Number> {
    protected T num;

    // ����������� ������ NumericFns, ����������� �������� ������ ���� T.
    NumericFns(T n) {
        this.num = n;
    }

    // ����� ��� �������� ����������� �������� �����.
    abstract double absValue();

    // ����� ��� �������� ����������� ��������� ���� �������� NumericFns.
    abstract boolean absEqual(NumericFns<?> ob);
}
