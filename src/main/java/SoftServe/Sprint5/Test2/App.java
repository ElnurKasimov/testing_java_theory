package SoftServe.Sprint5.Test2;

import java.util.Arrays;
import java.util.function.Consumer;

public class App {
    public static Consumer<double[]> cons = array -> {
        for(int i =0; i< array.length; i++) {
            if( array[i] > 2) array[i]*=0.8;
            else array[i]*=0.9;
        }
    };
    public static double[] getChanged(double[] initialArray, Consumer<double[]> consumer) {
        double[] result = Arrays.copyOf(initialArray, initialArray.length);
        consumer.accept(result);
        return result;
    }

    public static void main(String[] args) {
        double[] actual = App.getChanged(new double[] { 1, 2, 3, -1, -5, 0 }, App.cons);
        System.out.println(Arrays.toString(actual));
    }
}
