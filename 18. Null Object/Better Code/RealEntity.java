public class RealEntity extends AbstractEntity {
    private String property;

    public RealEntity(String property) {
        this.property = property;
    }

    @Override
    public String getProperty() {
        return property;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}