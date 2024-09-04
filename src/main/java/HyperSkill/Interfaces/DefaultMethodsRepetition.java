package HyperSkill.Interfaces;


import java.util.Scanner;

interface Shape {

     default String name() {
         return "Generic Shape";
     }
 }

interface Colorable {

    default String color() {
        return "No color";
    }
}

class Circle implements Shape, Colorable {
    @Override
    public String name() {
        return "Circle";
    }
}

class ColoredCircle extends Circle {

    @Override
    public String color() {
        return "Red";
    }
}

    // Finally, create a method that takes the string input and returns the name and color of the respective object
    public class DefaultMethodsRepetition {

    public static void getInformation (String str) {
        if("Circle".equals(str)) {
            Circle circle = new Circle();
            System.out.println(circle.name());
            System.out.println(circle.color());
        }
        if("ColoredCircle".equals(str)) {
            ColoredCircle coloredCircle = new ColoredCircle();
            System.out.println(coloredCircle.name());
            System.out.println(coloredCircle.color());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            String line = sc.nextLine();
            getInformation(line);
        }
        sc.close();
    }
}
