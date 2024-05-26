package Collections.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {
    public static void main(String[] args){
        HashMap<Integer,String> student=new HashMap<>();
        student.put(12,"Liam");
        student.put(20,"Revathy");
        student.put(35,"Sanoj");
        System.out.println(student);//doesn't follow any order while adding in the map

        System.out.println(student.get(20));
        student.put(20,"Revu"); //if present,it will replace the value of that key.
        System.out.println(student); //else add as a new pair

        student.replace(20,"RevathyR"); //if present,it will replace the value of that key.
        System.out.println(student);

        student.putIfAbsent(10,"Kichu");//add if not present. will not update if already present
        System.out.println(student);

        System.out.println(student.containsKey(11)); //check whether the key is present and returns true or false
        System.out.println(student.containsValue("Kichu")); //check whether the value is present

        student.remove(10); //remove the pair with given key from the map
        System.out.println(student);

        System.out.println("printing details 1");
        for (Map.Entry<Integer,String> m:student.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("printing details 2");
        student.forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println("printing details 3");
        Iterator<Map.Entry<Integer,String>> i=student.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry<Integer, String> entry = i.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
