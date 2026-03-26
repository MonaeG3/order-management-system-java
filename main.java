import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product(1, "Laptop", 899.99, 5);
        Product product2 = new Product(2, "Mouse", 24.99, 20);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Order Management System ===");
        inventory.displayProducts();

        System.out.print("\nEnter Product ID to order: ");
        int productId = scanner.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        Product selectedProduct = inventory.findProductById(productId);

        if (selectedProduct != null && selectedProduct.getQuantity() >= quantity) {
            Order order = new Order(1001, selectedProduct, quantity);
            selectedProduct.setQuantity(selectedProduct.getQuantity() - quantity);

            System.out.println("\nOrder created successfully.");
            order.displayOrder();
        } else {
            System.out.println("\nInvalid product ID or insufficient stock.");
        }

        scanner.close();
    }
}
