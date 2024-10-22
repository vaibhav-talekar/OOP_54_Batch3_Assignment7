/**
 * @author vaibhav talekar
 * @version 1.0
 * start date : 22-10-2024
 * modified date : 22-10-2024
 * Topic : Implementation of Generic classes, generic & lambda function & exception handling in using java
 * Description : Shop class is a generic class having generic function addproduct & fetchproduct
 */


class Shop<T> {
    private T item;
    private boolean isEmpty = true; // Track if the shop is empty

    public void addProduct(T item) {
        this.item = item;
        this.isEmpty = false; // Mark as not empty when a product is added
    }

    public T fetchProduct() throws EmptyShopException {
        if (isEmpty) {
            throw new EmptyShopException("No product available in the shop.");
        }
        isEmpty = true; // Mark the shop as empty after fetching
        return item;
    }
}
