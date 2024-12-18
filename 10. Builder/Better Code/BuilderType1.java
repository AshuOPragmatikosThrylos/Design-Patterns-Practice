class BuilderType1 extends Builder {

    // returns the builder itself to allow method chaining
    @Override
    Builder buildPartA() {
        getProduct().setPartA("Type1-A");
        return this;
    }

    @Override
    Builder buildPartB() {
        getProduct().setPartB("Type1-B");
        return this;
    }
}