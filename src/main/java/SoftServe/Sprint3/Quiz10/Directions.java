package SoftServe.Sprint3.Quiz10;

public enum Directions {
    NORTH(1), SOUTH(2), WEST(3), EAST(4);
    public int value;

    private Directions(int value) {
        this.value = value;
    }
}
