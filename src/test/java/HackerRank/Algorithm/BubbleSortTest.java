package HackerRank.Algorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private BubbleSort bubbleSort = new BubbleSort();

    @ParameterizedTest(name = "{index}. test that input array has been sorted by {2} swaps")
    @MethodSource

    void sortArray(int[] inputArray, int[] expected, int swaps) {
        assertEquals(swaps,bubbleSort.sortArray(inputArray));
        assertArrayEquals(expected,inputArray);
    }

    private static Stream<Arguments> sortArray() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 1}, new int[]{1, 2, 3}, 3),
                Arguments.of(new int[]{1, 1, 1}, new int[]{1, 1, 1}, 0),
                Arguments.of(new int[]{-1, -5, 6, 0, 3}, new int[]{-5, -1, 0, 3, 6}, 3)
                );
    }

    @ParameterizedTest(name = "{index}. test that input list has been sorted by {2} swaps")
    @MethodSource

    void sortList(List<Integer> inputList, List<Integer>  expected, int swaps) {
        assertEquals(swaps,bubbleSort.sortList(inputList));
        assertEquals(expected, inputList);
    }

    private static Stream<Arguments> sortList() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(3, 2, 1)), new ArrayList<>(Arrays.asList(1, 2, 3)), 3),
                Arguments.of(new ArrayList<>(Arrays.asList(1, 1, 1)), new ArrayList<>(Arrays.asList(1, 1, 1)), 0),
                Arguments.of(new ArrayList<>(Arrays.asList(-1, -5, 6, 0, 3)), new ArrayList<>(Arrays.asList(-5, -1, 0, 3, 6)), 3)
        );
    }
}