package HyperSkill.StreamAPI;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BadWordsDetectorTest {

    @ParameterizedTest(name = "{index}. test that with bad words {1} the method works correctly")
    @MethodSource
    void createBadWordsDetectingStream(String text, List<String> badWords, Stream<String> expected) {
        assertEquals(expected.toList(), BadWordsDetector.createBadWordsDetectingStream(text, badWords).toList());
    }

    private static Stream<Arguments> createBadWordsDetectingStream() {
        String text = "You need to implement a method that returns a prepared stream for detecting bad words" +
                " The method has two parameters a text in which all words are divided by single whitespaces " +
                "a list of all possible bad words The method must return a stream of " +
                "all unique bad words present in the text in lexicographical order (like in a dictionary";
        List<String> words1 = Arrays.asList("to", "two", "tt");
        List<String> words2 = Arrays.asList("all", "bad");
        return Stream.of(
                Arguments.of(text, Arrays.asList("to", "two", "tt"), Stream.of("to", "two")),
                Arguments.of(text, Arrays.asList("all", "bad"), Stream.of("all", "bad"))
        );
    }
}