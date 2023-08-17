package SoftServe.Sprint15;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintStackTraceTest {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String myStackTrace = sw.toString();
            System.out.println("myStackTrace :\n" + myStackTrace + "the end.");
        }
    }
}
