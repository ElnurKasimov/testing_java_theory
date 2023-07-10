package SoftServe.Sprint4.Test4;

public class ArrayUtil {
    public static <T> T setAndReturn(T[] array, T element, int index) {
        array[index] = element;
        return array[index];
    }
    public static void main(String[] args) {
        Integer[] numbers = new Integer[3];
        String[] words = new String[3];
        int numberFrom2Position= ArrayUtil.setAndReturn(numbers, 52, 1);
        String wordFrom2Position= ArrayUtil.setAndReturn(words, "Hello",1);
        System.out.println("numberFrom2Position = " + numberFrom2Position);
        System.out.println("wordFrom2Position = " + wordFrom2Position);
    }
}
