package lessonactor;

import java.util.List;

public class StreamService {
    public void sortShops(List<Shop> shops) {
        StreamShop streamShop = new StreamShop(shops);
        StreamComparator comparator = new StreamComparator();
        streamShop.getShops().sort(comparator);
    }
}
