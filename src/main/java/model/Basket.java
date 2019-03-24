package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Product> products;

    private BigDecimal totalPrice;


    public List<Product> getProducts() {
        return products;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public Basket() {
        products = new ArrayList<>();
        totalPrice = BigDecimal.ZERO;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice = totalPrice.add(product.getPrice());
    }


}
