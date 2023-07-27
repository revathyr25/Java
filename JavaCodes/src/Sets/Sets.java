package Sets;

import java.util.*;

public class Sets {
    public static void main(String[] args)  {
        Set<String> names=new HashSet<>();//doesn't maintain any order.removes duplicates
        names.add("Revu");
        names.add("Sanu");
        names.add("Leo");
        names.add("Sanu");
        names.add("Leo");
        System.out.println(names);

        Set<String> names1=new TreeSet<>(); //adds elements in alphabetical order
        names1.add("Revu");
        names1.add("Sanu");
        names1.add("Leo");
        names1.add("Sanu");
        names1.add("Leo");
        System.out.println(names1);

        Set<String> names2=new LinkedHashSet<>();//adds elements in insertion order
        names2.add("Revu");
        names2.add("Sanu");
        names2.add("Leo");
        names2.add("Sanu");
        names2.add("Leo");
        System.out.println(names2);

        //note:LinkedHashset is almost fast as hashset. while treeSet is much slower


        //adding all elements in a list to set
        List<String> namesList=new ArrayList<>();
        namesList.add("sanoj");
        namesList.add("Revathy");
        namesList.add("Liam");
        namesList.add("Revathy");

        Set<String> namesSet=new HashSet<>(namesList);
        System.out.println(namesSet);
        
    }

}
