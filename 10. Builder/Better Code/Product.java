public class Product {
    private String partA;
    private String partB;

    // product is not constructed using constructors because there may be too many parts, or some parts might be optional

    // product will instead be constructed by a builder, which will use the following setters
    public void setPartA(String partA) { this.partA = partA; }
    public void setPartB(String partB) { this.partB = partB; }

    @Override
    public String toString() {
        return String.format("Product [PartA=%s, PartB=%s]", 
                             formatField(partA), 
                             formatField(partB));
    }

    private String formatField(String fieldValue) {
        return (fieldValue != null) ? fieldValue : "Not set";
    }
}