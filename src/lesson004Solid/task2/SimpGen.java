package lesson004Solid.task2;

// Класс SimpGen для демонстрации класса TwoGen
public class SimpGen {
    public static void main(String args[]) {
        // Создание объекта TwoGen с параметрами Integer и String
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Обобщения");

        // Отображение типов T и V
        tgObj.showTypes();

        // Получение и отображение значения типа T
        int v = tgObj.getob1();
        System.out.println("Значение T: " + v);

        // Получение и отображение значения типа V
        String str = tgObj.getob2();
        System.out.println("Значение V: " + str);
    }
}