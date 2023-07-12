package SoftServe.Classes.Sprint4.Quiz2;

class A9 {}
class B9 extends A {}
class App<T> {}

public class Question9 {
    public static void main(String[] args) {
      App<B9> b = new App<>();
      App<? extends A> a = b;
    }


    public static void method ( App<? super B> value) {}
}
