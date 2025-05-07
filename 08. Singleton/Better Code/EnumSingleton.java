public enum EnumSingleton {
    INSTANCE; // The single instance

    @Override
    public String toString() {
        return "EnumSingleton@" + System.identityHashCode(this);
    }
}
