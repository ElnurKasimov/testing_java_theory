package SoftServe.Classes.Sprint4.Quiz2;

public class Questions10 {
    public static void main(String[] args) {
        String hundred = "100";
        Integer i1 = Integer.valueOf(hundred);
        Integer i2 = Integer.parseInt(hundred);
      //  Integer i3 = new Integer(hundred);
        Integer i4 = 100;
        Integer i5 = 100;

        System.out.println(i1 == i2); //true
       // System.out.println(i1 == i3);// false
        System.out.println(i4 == i5);// true
    }
}
