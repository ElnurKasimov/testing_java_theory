package MultiThreading;

import java.util.List;
import java.util.Vector;

class ChooseCollection {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = createSynchronizedList();
        Thread thread1 = new Thread(() -> addNumbers(numbers));
        Thread thread2 = new Thread(() -> addNumbers(numbers));

        thread1.start();
        thread2.start();
        addNumbers(numbers);

        thread1.join();
        thread2.join();

        System.out.println(numbers.size()); // 300_000
    }

    private static void addNumbers(List<Integer> numbers) {
        for (int i = 0; i < 100_000; ++i) {
            numbers.add(i);
        }
    }

    private static List<Integer> createSynchronizedList() {
        return new Vector<>();
    }

}
