package HyperSkill.Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    private StringUtils stringUtils = new StringUtils();
    @ParameterizedTest
    @ValueSource(strings = {"aaaa", "AaAaaaA", "Radar", "My gym", "Don't nod", "No lemon, no melon"})
    void testIsPalindrome(String string) {
        assertTrue(stringUtils.isPalindrome(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "hello!", "horror", "Ill will", "((()))", "[))))]", "222222122222"})
    void testIsNotPalindrome(String string) {
        assertFalse(stringUtils.isPalindrome(string));
    }
}