package lesson004Solid.task2;

// ����� SimpGen ��� ������������ ������ TwoGen
public class SimpGen {
    public static void main(String args[]) {
        // �������� ������� TwoGen � ����������� Integer � String
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "���������");

        // ����������� ����� T � V
        tgObj.showTypes();

        // ��������� � ����������� �������� ���� T
        int v = tgObj.getob1();
        System.out.println("�������� T: " + v);

        // ��������� � ����������� �������� ���� V
        String str = tgObj.getob2();
        System.out.println("�������� V: " + str);
    }
}