package HackerRank.Assesments;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < matrix.get(i).size()/2; j++) {
                sum1 += matrix.get(i).get(j);
            }
            for (int j = matrix.get(i).size()/2; j < matrix.get(i).size(); j++) {
                sum2 += matrix.get(i).get(j);
            }
            if (sum1 < sum2){
                for (int j = 0; j < matrix.get(i).size()/2; j++) {
                    int temp = matrix.get(i).get(j);
                    matrix.get(i).set(j,matrix.get(i).get(matrix.get(i).size() - 1 - j));
                    matrix.get(i).set(matrix.get(i).size() - j - 1, temp);
                }
            }

        }
        for (int i = 0; i < matrix.size()/2; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < matrix.get(i).size()/2; j++) {
                sum1 += matrix.get(i).get(j);
            }
            for (int j = 0; j < matrix.get(i+1).size()/2; j++) {
                sum2 += matrix.get(i+1).get(j);
            }
            if (sum1 < sum2){
                for (int j = 0; j < matrix.get(i).size(); j++) {
                    int temp = matrix.get(i).get(j);
                    matrix.get(i).set(j,matrix.get(i).get(matrix.get(i).size() - 1 - j));
                    matrix.get(i).set(matrix.get(i).size() - j - 1, temp);
                }
            }

        }
        return 0;
    }

}

public class FlippingMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Result.flippingMatrix(matrix);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
