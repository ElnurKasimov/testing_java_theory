package HackerRank.Scope;

// costraints
// elements contains positive integers (0 excluded)

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference (int[] elements) {
        this.elements = elements;
    }

    public int findMin() {
        if(elements.length == 0) {
            return 0;
        }
        int min = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if(elements[i] < min) {
                min = elements[i];
            }
        }
        return min;
    }
    public int findMax() {
        if(elements.length == 0) {
            return 0;
        }
        int max = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if(elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }

    public void computeDifference() {
        maximumDifference = findMax() - findMin();
    }

}
