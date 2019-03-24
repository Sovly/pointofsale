package model;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class ProductRepositoryImpl implements ProductRepository {

    private Map<Barcode,Product> products;

    public ProductRepositoryImpl(){
        List<Product> productsMock = new ArrayList<Product>() {{
           add(new Product(
                   new Barcode("123456789"),
                   "mleko",
                   BigDecimal.valueOf(2.49)));
           add(new Product(
                   new Barcode("123456788"),
                   "chleb pszenny",
                   BigDecimal.valueOf(2.00)));
           add(new Product(
                   new Barcode("123456798"),
                   "cebula siatka",
                   BigDecimal.valueOf(1.79)));
           add(new Product(
                   new Barcode("123654798"),
                   "bułka tarta",
                   BigDecimal.valueOf(1.10)));
           add(new Product(
                   new Barcode("224657912"),
                   "woda niegazowana 500 ml",
                   BigDecimal.valueOf(1.50)));
        }};

        this.products = productsMock
                .stream()
                .collect(Collectors.toMap(Product::getBarcode, p -> p));
    }


    @Override
    public Product getProductByBarcode(Barcode barcode){
        return products.get(barcode);
    }

    @Override
    public void addProduct(Product product){
        products.put(product.getBarcode(),product);
    }



}
