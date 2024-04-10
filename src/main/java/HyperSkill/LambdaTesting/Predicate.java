package HyperSkill.LambdaTesting;

class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (a, b, c) -> a == b && b == c;

    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int a, int b, int c);
    }

    public static void main(String[] args) {
        System.out.println(ALL_DIFFERENT.test(1,2,3));
        System.out.println(ALL_DIFFERENT.test(2,2,2));
    }
}
