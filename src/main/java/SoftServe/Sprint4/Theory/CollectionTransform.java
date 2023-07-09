package SoftServe.Sprint4.Theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTransform {
    public static void main(String[] args) {
        String[] sArr = {"one", "two", "three", "four"};
        List<String> sList = Arrays.asList(sArr); // make a  List
        System.out.println("size " + sList.size());
        System.out.println("List " + sList);
        sList.set(3, "six"); // Change List
        sArr[1] = "five"; // Change Array
        System.out.println("Array: " + Arrays.toString(sArr));
        System.out.println("sList: " + sList.get(1));
//--------------------------------------------------------------------
        List<Integer> iList = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            iList.add(i);
        }
        Object[] oArr = iList.toArray();
        Integer[] iArr = new Integer[3];
        iArr = iList.toArray(iArr);
//
        iArr[1] = 12;
        oArr[1] = 22;
        System.out.println("oArr Array: " + Arrays.toString(oArr)
                + "iArr Array: " + Arrays.toString(iArr));
        System.out.println("List: " + iList);
    }
}
