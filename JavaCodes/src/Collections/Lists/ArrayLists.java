package Collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("orange");
        fruits.add("plum");
        for (String i:fruits)
            System.out.println(i);
    }

    //uses dynamic array internally to store elements
    //maintain insertion order
    //can have duplicates
    //not synchronized so not threadsafe
    //better for storing and accessing
    //manipulation is slow
    //memory location is contiguous

}
