package HackerRank.Algorithm;

import java.util.List;

public class BubbleSort {
    public int sortArray(int[] array) {
        int numberOfSwaps = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1]=temp;
                    numberOfSwaps++;
                }
            }
        }
        return numberOfSwaps;
    }

    public int sortList(List<Integer> list) {
        int numberOfSwaps = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.remove(j);
                    list.add(j + 1, temp);
                    numberOfSwaps++;
                }
            }
        }
        return numberOfSwaps;
    }

}
