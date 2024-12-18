class BuilderType2 extends Builder {

    @Override
    Builder buildPartA() {
        getProduct().setPartA("Type2-A");
        return this;
    }

    @Override
    Builder buildPartB() {
        getProduct().setPartB("Type2-B");
        return this;
    }
}