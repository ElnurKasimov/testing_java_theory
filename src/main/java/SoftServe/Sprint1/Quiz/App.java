package SoftServe.Sprint1.Quiz;

public class App {

   static  class Parent {
        public void someMethod() {
            System.out.println("m1");
        }
    }

   static class Child extends Parent {
        public void someMethod() {
            System.out.println("m2");
        }
    }

    public static void main(String[] args) {
        Parent ins = new Child();
        ins.someMethod();
    }
}
