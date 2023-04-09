import Interfaces.ObjectTypeInterface;

class ObjectType1 implements ObjectTypeInterface {
    public ObjectType1() {
        log();
    }

    public void log() {
        System.out.println("ObjectType1");
    }
}