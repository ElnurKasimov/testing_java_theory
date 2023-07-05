package SoftServe.Sprint3.Task6;

import java.util.Arrays;

public class ArraysCopyTest {
    public static void main(String[] args) {
        int[] address = {1, 2, 3, 4, 5};
        int size = address.length;
        int[] temporary = address;
        address = Arrays.copyOf(temporary, size*2);
        System.out.println("address = " + Arrays.toString(address));
        int k = 1;
        for (int i = 0; i < k; i++) {
            System.out.println("i = " + i);
        }
    }
}
