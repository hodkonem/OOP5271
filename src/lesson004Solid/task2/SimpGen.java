package lesson004Solid.task2solid;

// ����� SimpGen ��� ������������ ������ TwoGen
public class SimpGen {
    public static void main(String args[]) {
        // �������� ������� TwoGen � ����������� Integer � String
        lesson004Solid.task2solid.TwoGen<Integer, String> tgObj = new lesson004Solid.task2solid.TwoGen<>(88, "���������");

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
