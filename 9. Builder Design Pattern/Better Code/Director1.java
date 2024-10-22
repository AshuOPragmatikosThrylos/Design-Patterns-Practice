// director is not needed if the client chooses which parts to skip
class Director1 {
    private Builder builder;

    // initializes with a specific builder; allows dynamic switching
    public Director1(Builder builder) { this.builder = builder; }

    // clients are abstracted from the build process
    // builder follows the director's instructions on which parts to build or skip
    public Product construct() {
        return builder
               .buildPartA()  // Skip partB
               .build();
    }
}