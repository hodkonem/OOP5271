package box;

/**
 * Обобщенный класс Box, представляющий собой коробку, которая
 * способна хранить объекты разных типов
 * В нем используется <T> тип объектов, которые могут храниться в Box
 */
public class Box<T> {
    private T object;

    public Box() {
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    /* метод printBoxContents() выводит на экран содержимое Box. Он работает с любым
    типом объекта, хранящегося в Box.
     */
    public void printBoxContents() {
        System.out.println("Box contains: " + object.toString());
    }
}
