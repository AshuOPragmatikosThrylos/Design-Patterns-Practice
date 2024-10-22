// abstract class preferred over interface for shared state (the product), common functionality (build)
abstract class Builder {
    // protected for subclass access; prevents direct client access to the product
    protected Product product;

    // Lazy initializes the product only when needed
    protected Product getProduct() {
        if (product == null) {
            product = new Product();
        }
        return product;
    }    

    // abstract methods ensure that concrete builders define their own specific parts of the product (e.g., different configurations for different builder types)
    abstract Builder buildPartA();
    abstract Builder buildPartB();

    // returns the final product after the build process
    // called by concrete builders after setting the necessary parts
    public Product build() {
        return getProduct();
    }
}