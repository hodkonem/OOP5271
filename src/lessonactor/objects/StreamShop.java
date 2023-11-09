package lessonactor.objects;

import java.util.Iterator;
import java.util.List;

public class StreamShop implements Iterable<Shop> {
    private final List<Shop> shops;

    public List<Shop> getShops() {
        return shops;
    }

    public StreamShop(List<Shop> shops) {
        this.shops = shops;
    }

    @Override
    public Iterator<Shop> iterator() {
        return shops.iterator();
    }
}
