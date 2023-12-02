package lesson004Solid.task3;

// ���������� ����� Pair, ������� ������ ��� ������� ����������� ����� T � V.
class Pair<T, V extends T> {
    T first;
    V second;

    // ����������� ������ Pair, ����������� ��� ������� ����������� �����.
    Pair(T a, V b) {
        first = a;
        second = b;
    }

    // ������ ��� ��������� ������� � ������� ��������.
    T getFirst() {
        return first;
    }

    V getSecond() {
        return second;
    }
}