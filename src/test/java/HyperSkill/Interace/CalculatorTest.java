package HyperSkill.Interace;

import HackerRank.Interace.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @ParameterizedTest(name = "{index}. test that sum of {0} divisors equal {1}")
    @MethodSource
    void divisorSum(int n, int expected) {
        assertEquals(expected, calculator.divisorSum(n));
    }

    private static Stream<Arguments> divisorSum() {
        return Stream.of(
                Arguments.of(0,0),
                Arguments.of(1,1),
                Arguments.of(2,3),
                Arguments.of(12,28)
        );
    }
}