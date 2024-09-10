package HyperSkill.ComparatorTesting;

import java.util.Comparator;
import java.util.List;

class StockItem {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public StockItem(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + pricePerUnit + ", " + quantity + ";";
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class Utils {
    public static List<StockItem> sort(List<StockItem> stockItems) {
        Comparator<StockItem> c = new Comparator<StockItem>() {
            @Override
            public int compare(StockItem s1, StockItem s2) {
                return Double.compare(s1.getPricePerUnit()*s1.getQuantity(),s2.getPricePerUnit()*s2.getQuantity());
            }
        };
        return stockItems.stream().sorted(с).toList();
    }
}