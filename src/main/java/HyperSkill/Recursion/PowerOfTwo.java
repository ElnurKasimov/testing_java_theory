package HyperSkill.Recursion;

public class PowerOfTwo {

//    The object is to finds out whether the positive number is a power of 2.
//    For example, 64 is a power of 2, but 12 is not.
    public boolean isPowerOfTwo(double n) {
        if (n == 1) {
            return true;
        }
        if (n > 1 && n < 2) {
            return false;
        }
        if (n >= 2) {
            return isPowerOfTwo(n/2);
        }
        return false;
    }
}
