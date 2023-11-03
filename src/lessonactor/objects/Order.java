package lessonactor.objects;

import domain.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Product> products = new ArrayList<>();

    private double sum = 0;
    private boolean isReady = false;
    private boolean isPaid = false;

    public Order(List<Product> products, double sum, boolean isReady, boolean isPaid) {
        this.products = products;
        this.sum = sum;
        this.isReady = isReady;
        this.isPaid = isPaid;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", sum=" + sum +
                ", isReady=" + isReady +
                ", isPaid=" + isPaid +
                '}';
    }
}
