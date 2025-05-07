class Director2 {
    private Builder builder;

    public Director2(Builder builder) { this.builder = builder; }

    public Product construct() {
        return builder
                .buildPartA()
                .buildPartB()
                .build();
    }
}