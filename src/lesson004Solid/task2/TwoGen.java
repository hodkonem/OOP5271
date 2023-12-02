package lesson004Solid.task2solid;

// ���������� ����� TwoGen
// ���������� ������� ������������ ���������������
class TwoGen<T, V> {
    private T ob1;
    private V ob2;

    // ����������� ������, ����������� ��� ��������� ����� T � V
    TwoGen(T o1, V o2) {
        this.ob1 = o1;
        this.ob2 = o2;
    }

    // ����� ��� ����������� ����� T � V
    void showTypes() {
        // ���������� �������� ����������/����������
        System.out.println("��� T - ��� " + ob1.getClass().getName());
        System.out.println("��� V - ��� " + ob2.getClass().getName());
    }

    // ������ ��� ��������� �������� ����� T � V
    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}