package Collections.Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {
    public static void main(String[] args) {

        Set<String> names2=new LinkedHashSet<>();
        names2.add("Revu");
        names2.add("Sanu");
        names2.add("Leo");
        names2.add("Sanu");
        names2.add("Leo");
        System.out.println(names2);

        //note:LinkedHashset is almost fast as hashset. while treeSet is much slower

        //adds elements in insertion order
        //no duplicates
        //allows null value
        //non synchronized
        //to maintain insertion order it requires more memory and cpu cycle compared to hashset
    }
}
