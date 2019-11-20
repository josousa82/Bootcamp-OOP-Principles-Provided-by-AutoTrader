package checkout;

public class Product {

    private int sku;
    private String name;
    private int price;


    public Product(int sku, String name, int price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public int getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
