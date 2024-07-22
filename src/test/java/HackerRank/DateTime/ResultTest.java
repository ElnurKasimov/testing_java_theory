package HackerRank.DateTime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @ParameterizedTest(name = "{index}. test that {0} converted into {1} correctly")
    @MethodSource
    void testTimeConversion(String input, String expected) {
        assertEquals(expected, Result.timeConversion(input));
    }
    private static Stream<Arguments> testTimeConversion() {
        return Stream.of(
                Arguments.of("12:00:00AM", "00:00:00"),
                Arguments.of("12:00:00PM", "12:00:00"),
                Arguments.of("00:00:00AM", "00:00:00"),
                Arguments.of("00:00:00PM", "12:00:00"),
                Arguments.of("11:59:30AM", "11:59:30"),
                Arguments.of("11:59:30PM", "23:59:30")
        );
    }
}