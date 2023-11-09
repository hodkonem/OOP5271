package lessonactor.objects;

import domain.Product;

import java.util.Iterator;

public class Supermarket extends Shop {
    private int productsCount;

    public Supermarket(String name, int productsCount) {
        super(name);
        this.productsCount = productsCount;
    }

    @Override
    public int getProductsCount() {
        return productsCount;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}