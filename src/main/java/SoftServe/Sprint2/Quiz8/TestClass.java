package SoftServe.Sprint2.Quiz8;


    class Base {
        public short getValue () { return 100;}
    }
    class Derived extends Base {
        public short getValue () { return 5;}  // byte is inpossible
    }

public class TestClass {
    public static void main(String[] args) {
        Base b = new Derived();
        System.out.println(b.getValue());
    }
}
