package Collections.Sets;

import java.util.*;

public class HashSets {
    public static void main(String[] args)  {
        Set<String> names=new HashSet<>();
        names.add("Revu");
        names.add("Sanu");
        names.add("Leo");
        names.add("Sanu");
        names.add("Leo");
        System.out.println(names);


        //adding all elements in a list to set
        List<String> namesList=new ArrayList<>();
        namesList.add("sanoj");
        namesList.add("Revathy");
        namesList.add("Liam");
        namesList.add("Revathy");

        Set<String> namesSet=new HashSet<>(namesList);
        System.out.println(namesSet);
        Iterator<String> itr=namesSet.iterator();
        System.out.println("using iterator");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //doesn't maintain any order.removes duplicates
        //stores elements by using hashing
        //no duplicates
        //allows null value
        //non synchronized
        //elements are inserted based on their hashcode
        //best for search operations
        
    }

}
