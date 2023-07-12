package SoftServe.Classes.Sprint4.Quiz2;

class A {}
class B extends A {}
class C extends B {}

public class Question8 {
    public static void main(String[] args) {
        method(new App<A>());
        method(new App<B>());
    //    method(new App<C>());
        method(new App());
    }

    static class App<T> {}
    public static void method ( App<? super B> value) {}
}
