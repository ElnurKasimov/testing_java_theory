package HackerRank.Strings;

import java.util.*;


public class IsAnagram
{
    static boolean isAnagram(String a, String b) {
        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();
        Map<Character,Integer> mapA = new HashMap<>();
        Map<Character,Integer> mapB = new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            if (mapA.containsKey(a1[i])) {
                mapA.put(a1[i], mapA.get(a1[i]) + 1);
            } else {
                mapA.put(a1[i], 1);
            }
        }
        for (int i = 0; i < b1.length; i++) {
            if (mapB.containsKey(b1[i])) {
                mapB.put(b1[i], mapB.get(b1[i]) + 1);
            } else {
                mapB.put(b1[i], 1);
            }
        }
        return mapA.equals(mapB);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
