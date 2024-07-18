package HackerRank.Exceptions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator = new Calculator();
    @ParameterizedTest(name="{index}. test that {0} in power {1} returns {2}")
    @MethodSource
    void testThatPowerWorksCorrectlyWithPositiveArguments(int n, int p, int expected) {
        assertEquals(expected, calculator.power(n, p));
    }
    private static Stream<Arguments> testThatPowerWorksCorrectlyWithPositiveArguments() {
        return Stream.of(
                Arguments.of(0, 0, 1),
                Arguments.of(0, 3, 0),
                Arguments.of(1, 0, 1),
                Arguments.of(1, 7, 1),
                Arguments.of(3, 5, 243)
        );
    }

    @ParameterizedTest(name="{index}. test that {0} in power {1} throws ArithmeticException")
    @MethodSource
    void testThatPowerTrowsExceptionWithNegativeArguments(int n, int p) {
        assertThrows(ArithmeticException.class, ()->calculator.power(n,p));
    }
    private static Stream<Arguments> testThatPowerTrowsExceptionWithNegativeArguments() {
        return Stream.of(
                Arguments.of(-1, 2),
                Arguments.of(3, -5)
        );
    }

}