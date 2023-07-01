package SoftServe.Sprint1.Tasks;

public class Plant {
    private String name;
    Color color;
    Type type;

    public enum Color {
        White, Red, Blue
    }

    public enum Type {
        Rare, Ordinary
    }

    public Plant(String type, String color, String name) {
        this.type = Type.valueOf(type);
        this.color = Color.valueOf(color);
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }


    public static void main(String[] args) {
       Plant plant1 = new Plant("Rare", "Red",  "name1" );
        System.out.println("it's ok");
        Plant plant2 = new Plant("Rare", "Pink",  "name2" );
    }
}
