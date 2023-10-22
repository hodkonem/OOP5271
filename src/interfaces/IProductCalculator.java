package interfaces;

import domain.Product;

public interface IProductCalculator {
    double calculateProductPrice(Product product);
    double calculateProductQuantity(Product product);
    double calculateProductTotal(Product product);
}
