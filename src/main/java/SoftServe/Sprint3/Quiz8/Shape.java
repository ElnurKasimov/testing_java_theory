package SoftServe.Sprint3.Quiz8;

abstract public class Shape {
    protected  String color;
    public Shape(String color) {
        this.color = color;
    }
    abstract public void draw ();
}
