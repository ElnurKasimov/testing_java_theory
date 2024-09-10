package HyperSkill.ComparatorTesting;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @ParameterizedTest(name = "{index}. Test that method sort() work correctly)")
    @MethodSource
    void sort(List<StockItem> input, List<StockItem> expected) {
        assertEquals(expected, Utils.sort(input));
    }

    private static Stream<Arguments> sort() {
        List<StockItem> input1 = new ArrayList<>();
        input1.add(new StockItem("nails",0.01, 512));
        input1.add(new StockItem("hammers", 7.5, 24));
        input1.add(new StockItem("screws",0.02, 318));
        List<StockItem> expected1 = new ArrayList<>();
        expected1.add(new StockItem("hammers", 7.5, 24));
        expected1.add(new StockItem("screws",0.02, 318));
        expected1.add(new StockItem("nails",0.01, 512));
        List<StockItem> input2 = new ArrayList<>();
        input2.add(new StockItem("pens", 3.72, 40));
        input2.add(new StockItem("pencils", 1.45, 75));
        input2.add(new StockItem("notebooks", 0.84, 130));
        List<StockItem> expected2 = new ArrayList<>();
        expected2.add(new StockItem("pens", 3.72, 40));
        expected2.add(new StockItem("notebooks", 0.84, 130));
        expected2.add(new StockItem("pencils", 1.45, 75));
        return Stream.of(
                Arguments.of(input1, expected1),
                Arguments.of(input2, expected2)
        );
    }

}