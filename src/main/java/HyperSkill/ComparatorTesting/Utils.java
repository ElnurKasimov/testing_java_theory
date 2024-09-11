package HyperSkill.ComparatorTesting;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockItem stockItem = (StockItem) o;
        return Double.compare(getPricePerUnit(), stockItem.getPricePerUnit()) == 0 && getQuantity() == stockItem.getQuantity() && Objects.equals(getName(), stockItem.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPricePerUnit(), getQuantity());
    }
}

public class Utils {
    public static List<StockItem> sort(List<StockItem> stockItems) {
        return stockItems.stream().sorted(
                new Comparator<StockItem>() {
                    @Override
                    public int compare(StockItem s1, StockItem s2) {
                        return Double.compare(s2.getPricePerUnit()*s2.getQuantity(),s1.getPricePerUnit()*s1.getQuantity());
                    }
                }).toList();
    }
}