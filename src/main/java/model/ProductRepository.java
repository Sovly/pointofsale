package model;

public interface ProductRepository {

    public Product getProductByBarcode(Barcode barcode);

    public void addProduct(Product product);


}
