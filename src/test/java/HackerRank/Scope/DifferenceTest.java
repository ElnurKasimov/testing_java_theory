package HackerRank.Scope;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferenceTest {


    @ParameterizedTest(name = "{index}. test that for {0} min {1}")
    @MethodSource("findMinimum")
    void testThatFindMinWorksCorrectly(int[] elements, int expected) {
        Difference difference = new Difference(elements);
        assertEquals(expected, difference.findMin());
    }
    private static Stream<Arguments> findMinimum() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1,1,1}, 1),
                Arguments.of(new int[]{1,2,3}, 1)
        );
    }

    @ParameterizedTest(name = "{index}. test that for {0} max {1}")
    @MethodSource("findMaximum")
    void testThatFindMaxWorksCorrectly(int[] elements, int expected) {
        Difference difference = new Difference(elements);
        assertEquals(expected, difference.findMax());
    }
    private static Stream<Arguments> findMaximum() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1,1,1}, 1),
                Arguments.of(new int[]{1,2,3}, 3)
        );
    }
    @ParameterizedTest(name = "{index}. test that for {0} max absolute difference {1}")
    @MethodSource
    void testThatComputeDifferenceWorksCorrectly(int[] elements, int expected) {
        Difference difference = new Difference(elements);
        difference.computeDifference();
        assertEquals(expected, difference.maximumDifference);
    }
    private static Stream<Arguments> testThatComputeDifferenceWorksCorrectly() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1,1,1}, 0),
                Arguments.of(new int[]{1,2,3}, 2)
        );
    }

}