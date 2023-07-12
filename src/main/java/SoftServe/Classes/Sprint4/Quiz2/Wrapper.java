package SoftServe.Classes.Sprint4.Quiz2;

public class Wrapper <T extends Number> {
    private T value;
    public Wrapper(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}
