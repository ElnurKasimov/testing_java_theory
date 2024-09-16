package HyperSkill.StreamAPI;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddFilterTest {

    @ParameterizedTest(name = "{index}. test that with {0} and {1} the method returns {2}")
    @MethodSource
    void createFilteringStream(List<Integer> evenNumbers, List<Integer> oddNumbers, List<Integer> expected) {
        IntStream even = evenNumbers.stream().mapToInt(Integer::intValue);
        IntStream odd = oddNumbers.stream().mapToInt(Integer::intValue);
        List<Integer> actual = EvenAndOddFilter.createFilteringStream(even, odd)
                .boxed()
                .toList();
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> createFilteringStream() {

        return Stream.of(
                Arguments.of(Arrays.asList(1,13,7), Arrays.asList(2,4,6), new ArrayList<>()),
                Arguments.of(Arrays.asList(3,45,7,75), Arrays.asList(60,83,90), Arrays.asList(75,90))
        );
    }

}