package SoftServe.Sprint1.Exceptions;

public class App {
    public static void firstMethod() {
        try {
            secondMethod();
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
            throw new IllegalArgumentException("IllegalArgumentException thrown from finally block of firstMethod");
        }
    }
    public static void secondMethod() throws NullPointerException{
        try {
                lastMethod();
            } catch (NullPointerException e) {
                System.out.println("Caught Exception: " + e.getMessage());
                throw e;
            } finally {
                throw new IllegalArgumentException("IllegalArgumentException thrown from finally block of secondMethod");
        }
    }
    public static void lastMethod() {
            String str = null;
            System.out.println("Length of string: " + str.length());
    }

    public static void myMethod(int a) throws MyOwnException {
        if (a<=0) {
            throw new MyOwnException();
        } else {
            System.out.println("a = " + a/0);
        }

    }
    public static void main(String[] args) {
        try {
            firstMethod();
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
     // Application continues to run after catching the exception
     System.out.println("Application still running");

//---------------------------------
    try {
        myMethod(0);
    } catch (MyOwnException e) {
        e.printStackTrace();
        }
    }
}
