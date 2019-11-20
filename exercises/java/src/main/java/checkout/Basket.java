package checkout;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Product> products = new ArrayList<>();
    private Integer total;

    public void addProduct(Product product){
        products.add(product);
        total += product.getPrice();
    }

    public ArrayList<Product> getProducts() {
        return new ArrayList<Product>(products);
    }

    public Integer getTotal() {
        return Integer.valueOf(total);
    }
}
