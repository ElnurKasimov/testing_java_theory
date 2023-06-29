package SoftServe.Sprint1.Classes;

public class App {
    public static void main(String[] args) {
// ---------------------
        Square square1 = new Square(10);
        Square square2 = new Square(15);
        square2 = square1;
        int area1 = square1.getArea();
        int area2 = square2.getArea();
        System.out.println(area1 + "  " + area2);
// ---------------------
        ParamValue paramValue = new ParamValue();
        System.out.println("\tBy Value, Value Type (Primitive)");
        int i = 1;
        System.out.println("i= " + i + "\tIn main method before method will work.");
        paramValue.passArg(i);
        System.out.println("i= " + i + "\tIn main method after method have worked.\n");
// ---------------------
        ParamObject paramObject = new ParamObject();
         System.out.println("\tBy Value, Reference Type");
         Castomer castomer = new Castomer();
         System.out.println(castomer + "\tIn main method before method passArg(Castomer castomer) will work.");
         paramObject.passArg(castomer);
         System.out.println(castomer + "\tIn main method after method passArg(Castomer castomer) have worked.\n");
// ---------------------
        ParamImmutable paramImmutable = new ParamImmutable();
        System.out.println("\tBy Value, Reference Immutable Type");
        String s = "First";
        System.out.println("s= " + s + "\tIn main method before method passArg(String s) will work.");
        paramImmutable.passArg(s);
        System.out.println("s= " + s + "\tIn main method after method passArg(String s) have worked.");
    }
}

