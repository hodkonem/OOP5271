package lesson004Solid.task1solid;

// Класс GenDemo для демонстрации использования обобщенных классов
// Использует принцип подстановки Барбары Лисков
public class GenDemo {
    public static void main(String[] args) {
        // Создаем объект типа Gen<Integer>
        Gen<Integer> iOb = new Gen<>(88);

        // Отображаем тип данных, используемый в объекте iOb
        iOb.showType();

        // Получаем значение из объекта iOb
        int v = iOb.getOb();
        System.out.println("Значение: " + v);

        System.out.println();

        // Создаем объект типа Gen<String>
        Gen<String> strOb = new Gen<>("Тестирование");

        // Отображаем тип данных, используемый в объекте strOb
        strOb.showType();

        // Получаем значение из объекта strOb
        String str = strOb.getOb();
        System.out.println("Значение: " + str);
    }
}