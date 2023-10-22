package service;

import domain.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private Holder holder;
    private CoinDispenser coinDispenser;
    private List<Product> productList;
    private List<Product> purchasedProducts;

    public VendingMachine(Holder holder, CoinDispenser coinDispenser, List<Product> productList) {
        this.holder = holder;
        this.coinDispenser = coinDispenser;
        this.productList = productList;
        this.purchasedProducts = new ArrayList<>();
    }

    public Product buyProduct(int index) {
        Product product = this.productList.get(index);
        this.purchasedProducts.add(product);
        return product;
    }

    public void release() {}

    public List<Product> getProductList() {
        return productList;
    }
}
