package HackerRank.OneDimensionalArrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayGameTest {

    @ParameterizedTest(name="{index}. test that {1} with leap {2} return true")
    @MethodSource
    void testThatCanWinReturnTrue(int leap, int[] game) {
        assertTrue(ArrayGame.canWin(leap,game));
    }

    private static Stream<Arguments> testThatCanWinReturnTrue() {
        return Stream.of(
                Arguments.of(1, new int[]{0}),
                Arguments.of(2, new int[]{0,1}),
                Arguments.of(1, new int[]{0,0}),
                Arguments.of(2, new int[]{0,1,0,1}),
                Arguments.of(3, new int[]{0,1,1,0})
        );
    }

    @ParameterizedTest(name="{index}. test that {1} with leap {2} return false")
    @MethodSource
    void testThatCanWinReturnFalse(int leap, int[] game) {
        assertFalse(ArrayGame.canWin(leap,game));
    }

    private static Stream<Arguments> testThatCanWinReturnFalse() {
        return Stream.of(
                Arguments.of(1, new int[]{0,1}),
                Arguments.of(2, new int[]{0,1,1}),
                Arguments.of(2, new int[]{0,1,1,0,0}),
                Arguments.of(3, new int[]{0,1,1,1,0}),
                Arguments.of(6, new int[]{0,0,1,1,0,0,1,1,0,0})
        );
    }

    @ParameterizedTest(name="{index}. test that {0} contains '1' only")
    @MethodSource
    void testThatContainsAllOnesReturnTrue(int[] subArray) {
        assertTrue(ArrayGame.containsAllOnes(subArray));
    }

    private static Stream<Arguments> testThatContainsAllOnesReturnTrue() {
        return Stream.of(
                Arguments.of(new int[]{1}),
                Arguments.of(new int[]{1,1}),
                Arguments.of(new int[]{1,1,1})
        );
    }

    @ParameterizedTest(name="{index}. test that {0} contains '1' and '0'")
    @MethodSource
    void testThatContainsAllOnesReturnFalse(int[] subArray) {
        assertFalse(ArrayGame.containsAllOnes(subArray));
    }

    private static Stream<Arguments> testThatContainsAllOnesReturnFalse() {
        return Stream.of(
                Arguments.of(new int[]{}),
                Arguments.of(new int[]{0}),
                Arguments.of(new int[]{0,0}),
                Arguments.of(new int[]{1,0}),
                Arguments.of(new int[]{0,1,1}),
                Arguments.of(new int[]{1,1,0})
        );
    }

}