package service;

import domain.Product;
import interfaces.IProductCalculator;

public class CoinDispenser implements IProductCalculator {
    private double price;
    private double quantity;


    @Override
    public double calculateProductPrice(Product product) {
        return price;
    }

    @Override
    public double calculateProductQuantity(Product product) {
        return quantity;
    }

    @Override
    public double calculateProductTotal(Product product) {
        return price * quantity;
    }
}

