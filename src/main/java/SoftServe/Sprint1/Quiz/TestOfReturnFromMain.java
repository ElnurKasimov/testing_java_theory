package SoftServe.Sprint1.Quiz;

public class TestOfReturnFromMain {
    public static void main(String[] args) {
        try {
            return;
        } finally {
            System.out.println("Finally");
        }
    }
}
