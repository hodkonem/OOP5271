package lessonactor.objects;

import domain.Product;

import java.util.Iterator;
import java.util.List;

public class IteratorProduct implements Iterator<Product> {
    private final List<Product> products;
    private int count;

    public IteratorProduct(List<Product> products) {
        this.products = products;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < products.size() - 1;
    }

    @Override
    public Product next() {
        if (!hasNext()) {
            return null;
        }
        count++;
        return products.get(count);
    }

    @Override
    public void remove() {
        products.remove(count);
        Iterator.super.remove();
    }
}
