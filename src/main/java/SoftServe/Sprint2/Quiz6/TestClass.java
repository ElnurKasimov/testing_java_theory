package SoftServe.Sprint2.Quiz6;

class Super {
    public int getNumber(int a) {
        return a;
    }
}

public class TestClass extends Super {
    public int getNumber(int a, int b) {
        return 5;
    }

    public static void main(String[] args) {
        System.out.println(new TestClass().getNumber(4));
    }
}
