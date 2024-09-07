package HyperSkill.Tests;

class StringUtils {
    public static boolean isPalindrome(String str) {
        String newStr = str.replaceAll("[^\\p{L}]", "").toLowerCase();
        if(newStr.isEmpty()) {
            return false;
        }
        char[] letters = newStr.toCharArray();
        for (int i = 0; i < letters.length/2; i++) {
            if(letters[i] != letters[letters.length- 1- i]) {
                return false;
            }
        }
        return true;
    }

}
