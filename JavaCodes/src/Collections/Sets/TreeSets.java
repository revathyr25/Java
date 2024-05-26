package Collections.Sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
//        TreeSet<String> names1=new TreeSet<>();
//        names1.add("Revu");
//        names1.add("Sanu");
//        names1.add("Leo");
//        names1.add("Sanu");
//        names1.add("Leo");
//        System.out.println(names1);

        ArrayList<String> names1=new ArrayList<>();
        names1.add("Revu");
        names1.add("Sanu");
        names1.add("Leo");
        names1.add("Sanu");
        names1.add("Leo");

        boolean b=!true;
        boolean d=true& false;
        boolean c=true|false;
        boolean e=d?b:c;
        System.out.println(e);

        char a[]=new char[10];
        for(int i=0;i<10;++i){
            a[i]='i';
            System.out.print(a[i]+"");
            i++;

        }

        System.out.println();
        Employee obj=new Employee();
        obj.cal(2,3);
        System.out.println(obj.x);
        obj.print();

        //adds elements in alphabetical order
        //no duplicates
        //allows null value
        //non synchronized
        //access and retrieval times are quiet fast
        //allows only generic types that are comparable
        //implemented using binary tree
        //operation like search,remove,consume takes logN time since it is self balancing tree
        //bcos of which tree height never exceeds o(logN) for all those operations.
        //efficient DS to keep large sorted data and also do operations in it
    }
}
