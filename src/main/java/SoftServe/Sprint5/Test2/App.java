package SoftServe.Sprint5.Test2;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

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
        double[] actual = new double[] { 1., 2., 3., -1., -5., 0. };
        double[] result = App.getChanged(actual, App.cons);
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(result));
        Supplier<Double> sup = () -> {
            double average = 0.;
            double sum = 0;
            for(double number : actual) {
                sum+=number;
            }
            return sum/actual.length;
        };
        System.out.println(" result = " + sup.get());
    }
}
