package lesson004Solid.task2;

// ���������� ����� TwoGen � ����� ����������� ���� T � V
class TwoGen<T, V> {
    T ob1;
    V ob2;

    // ����������� ������, ����������� ��� ��������� ����� T � V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // ����� ��� ����������� ����� T � V
    void showTypes() {
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