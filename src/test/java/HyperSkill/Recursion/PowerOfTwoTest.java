package HyperSkill.Recursion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {
    private PowerOfTwo powerOfTwo = new PowerOfTwo();

    @ParameterizedTest (name = "{index}. test {0} as power of two returns {1} ")
    @MethodSource
    void isPowerOfTwo(double n, boolean expected) {
        assertEquals(expected, powerOfTwo.isPowerOfTwo(n));
    }

    private static Stream<Arguments> isPowerOfTwo() {
        return Stream.of(
                Arguments.of(0, false),
                Arguments.of(1, true),
                Arguments.of(2, true),
                Arguments.of(11, false),
                Arguments.of(12, false),
                Arguments.of(64, true)
        );
    }
}