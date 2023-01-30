public class GenericClass {
    private Object value;

    public GenericClass(Object value) {
        this.value = value;
    }

    public String toString() {
        return this.value.getClass().getSimpleName() + " Value: " + this.value;
    }
}
