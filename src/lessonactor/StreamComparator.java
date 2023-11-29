package lessonactor;

import java.util.Comparator;

public class StreamComparator implements Comparator<Shop> {
    @Override
    public int compare(Shop shop1, Shop shop2) {
        return Integer.compare(shop1.getProductsCount(), shop2.getProductsCount());
    }
}
