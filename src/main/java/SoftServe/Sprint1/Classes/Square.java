package SoftServe.Sprint1.Classes;

public   class Square {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}
