package HyperSkill.Patterns.Singletone;

import java.sql.SQLOutput;

class Singleton {

    private static Singleton instance;

    public String data;

    private Singleton (String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        if (instance == null) {
            instance = new Singleton(data);
        }
        return instance;
    }

    public void printData() {
        System.out.print(data + " ");
    }
}


class A {

    private static A instance;

    private String s;

    private A (String s) {
        this.s = s;
    }

    public static A getInstance(String s) {
        if (instance == null) {
            instance = new A(s);
        }
        return instance;
    }

    public static A getNewInstance(String s) {
        return new A(s);
    }

    public String getS() {
        return s;
    }
}
public class ObjectsBehaviour {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance("data1");
        Singleton instance2 = Singleton.getInstance("data2");
        instance1.printData();
        instance2.printData();
        Singleton instance3 = Singleton.getInstance("data3");
        instance3.data = "data4";
        instance3.printData();

        System.out.println();

        System.out.println("1" + A.getInstance("foo").getS());
        System.out.println("2" + A.getInstance("bar").getS());
        System.out.println("3" + A.getNewInstance("foo").getS());
        System.out.println("4" + A.getNewInstance("bar").getS());
        A instance = A.getInstance("thx");
        System.out.println("5" + instance.getS());
    }

}
