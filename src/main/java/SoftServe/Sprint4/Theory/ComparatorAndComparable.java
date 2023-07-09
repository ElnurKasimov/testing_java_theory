package SoftServe.Sprint4.Theory;

import java.util.Comparator;

public class ComparatorAndComparable {

    class ComparatorTest1 implements Comparator<String> {
        public  int compare( String o1, String o2) {
            return 0;
        }
    }

    class ComparatorTest2 implements Comparator{
        public  int compare( Object o1, Object o2) {
            return 0;
        }
    }

    class ComparableTest1 implements Comparable {
        public int compareTo(Object o) {
            return 0;
        }
    }

    class ComparableTest2 implements Comparable<String> {
        public int compareTo(String o1) {
            return 0;
        }
    }



}
