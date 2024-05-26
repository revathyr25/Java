package Collections.Maps;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
    TreeMap<Integer,String> student=new TreeMap();
    student.put(12,"Liam");
    student.put(35,"Sanoj");
    student.put(20,"Sujatha");
    System.out.println(student);// follow alphabetical order of key while adding in the TreeMap
}
}
