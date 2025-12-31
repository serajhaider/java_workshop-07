
/**
 * Represents a customer in the shopping system.
 */
public class ECommerceSystem {

    int customerId;
    String name;
    String email;
    String password;

    /**
     * Registers the customer.
     */
    public void register() {
        System.out.println("Customer registered");
    }

    /**
     * Logs in the customer.
     */
    public void login() {
        System.out.println("Customer logged in");
    }

    /**
     * Views available products.
     */
    public void viewProducts() {
        System.out.println("Viewing products");
    }

    /**
     * Adds product to cart.
     */
    public void addToCart() {
        System.out.println("Product added to cart");
    }

    /**
     * Proceeds to checkout.
     */
    public void checkout() {
        System.out.println("Checkout complete");
    }
}
