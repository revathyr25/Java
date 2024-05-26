package Collections.Maps;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> student=new LinkedHashMap<>();
        student.put(12,"Liam");
        student.put(35,"Sanoj");
        student.put(20,"Revathy");
        System.out.println(student);// follow insertion order while adding in the LinkedHashmap
    }
}
