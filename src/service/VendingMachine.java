package service;

import domain.Product;

import java.util.List;

public class VendingMachine {
    private Holder holder;
    private CoinDispanser coinDispanser;
    private List<Product> productList;

    public VendingMachine(Holder holder, CoinDispanser coinDispanser, List<Product> productList) {
        this.holder = holder;
        this.coinDispanser = coinDispanser;
        this.productList = productList;
    }

    public Product buyProduct(int index) {
        return this.productList.get(index);
    }

    public void release() {}

    public List<Product> getProductList() {
        return productList;
    }
}
