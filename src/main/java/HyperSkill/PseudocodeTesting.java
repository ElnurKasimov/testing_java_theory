package HyperSkill;

public class PseudocodeTesting {
    public static void main(String[] args) {
        int[] a = new int[] {677,591,153,356,617,337,195,948,440,657,631,546,148,678};
        boolean f = false;
        int x = a[0];
        for (int i = 0; i < a.length ; i++) {
            if ((a[i] % 2 == 0) && (!f)) {
                x = a[i];
                f = true;
            }
            if ((a[i] < x) && (a[i] % 2 == 0)) {
                x = a[i];
            }
        }
        if (f) {
            System.out.println(x);
        } else {
            System.out.println(0);
        }

    }

}
