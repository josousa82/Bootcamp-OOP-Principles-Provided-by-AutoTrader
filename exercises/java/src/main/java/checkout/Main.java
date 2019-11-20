package checkout;

public class Main {

    public static void main(String[] args) {

        Checkout checkout = new Checkout();
        Receipt receipt = new Receipt();
        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");

        System.out.println("checkout.receipt() = " + checkout.receipt());
        //System.out.println("checkout.total() = " + checkout.total());

    }
}
