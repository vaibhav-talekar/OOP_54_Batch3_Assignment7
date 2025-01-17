/**
 * @author vaibhav talekar
 * @version 1.0
 * start date : 22-10-2024
 * modified date : 22-10-2024
 * Topic : Implementation of Generic classes, generic & lambda function & exception handling in using java
 * Description : Product class extends Shop class (generic class).The following code add products to Shop class by creating objects that class & implements the lambda function to fetch product from Shop.Also uses try-catch block to handle emptyshop Exception.
 */

import java.util.function.Consumer;

// Custom exception for empty shop
class EmptyShopException extends Exception {
    public EmptyShopException(String message) {
        super(message);
    }
}

public class Product extends Shop{
    public static void main(String[] args) {
        Shop<String> product1 = new Shop<>();
        Shop<Double> product2 = new Shop<>();

        try {
            product1.addProduct("Rod");
            product2.addProduct(3.14);

            // Define a simple lambda function to print the product
            Consumer<Object> printProduct = item -> System.out.printf("%s%n", item);

            // Fetch and print products using the lambda
            printProduct.accept(product1.fetchProduct());
            printProduct.accept(product2.fetchProduct());

            // Attempting to fetch from an empty shop to demonstrate exception handling
            System.out.printf("%s%n", product1.fetchProduct()); // This will throw an exception
        } catch (EmptyShopException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
        finally{
            System.out.println("Existing Code...");
        }
    }
}
