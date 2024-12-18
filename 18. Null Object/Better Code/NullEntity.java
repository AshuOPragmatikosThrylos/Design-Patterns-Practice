public class NullEntity extends AbstractEntity {
    @Override
    public String getProperty() {
        return "No Property Available";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}