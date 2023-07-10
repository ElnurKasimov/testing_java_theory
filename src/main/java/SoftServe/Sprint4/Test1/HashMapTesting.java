package SoftServe.Sprint4.Test1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTesting {
    public static void main(String[] args) {
        Map<String, List<String>> test = new HashMap<>();
        System.out.println("test = " + test);
        for(Map.Entry entry : test.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
