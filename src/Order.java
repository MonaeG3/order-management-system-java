public class Order {
    private int orderId;
    private Product product;
    private int quantity;
    private double totalPrice;

    public Order(int orderId, Product product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
    }
}
