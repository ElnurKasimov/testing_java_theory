package HyperSkill.InnerClassesTesting;

public class Cat {

    private String name;
    private String color;
    private int size;

    public Cat(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void printColor() {
        System.out.print("Cat " + name + " is " + color + ". ");
        System.out.print("The size of " + name + " is " + size + ". ");

        // Создаем экземпляр класса Bow
        Bow bow = new Bow("red", 15);

        // Получаем доступ к полям класса Bow
        System.out.print("Cat " + name + " has " + bow.color + " bow. ");
        System.out.print("The size of bow is " + bow.size + ".");
    }

    public class Bow {
        String color;
        int size;

        public Bow(String color, int size) {
            this.color = color;
            this.size = size;
        }
//      If the method is here than we shouldn't create any instances and get access directly
//        public void printColor() {
//            System.out.print("Cat " + name + " is " + Cat.this.color + ". ");
//            System.out.print("The size of " + name + " is " + Cat.ths.size + ". ");
//            System.out.print("Cat " + name + " has " + this.color + " bow. ");
//            System.out.print("The size of bow is " + this.size + ".");
//        }

    }

    public static void main(String[] args) {

        Cat cat = new Cat("Bob", "white", 10);
        Cat.Bow bow = cat.new Bow("red", 15);

        cat.printColor();
    }
}
