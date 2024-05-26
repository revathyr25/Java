package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Student> s=new ArrayList<>();
        Student s1=new Student(1,"gayi","FS");
        Student s2=new Student(2,"kichu","AE");
        Student s3=new Student(4,"sugu","CS");
        Student s4=new Student(6,"leo","EC");
        Student s5=new Student(7,"viru","EC");
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);

        List<Course> c=new ArrayList<>();
        Course c1=new Course(100,"EC");
        Course c2=new Course(101,"CS");
        Course c3=new Course(102,"FS");
        Course c4=new Course(103,"AE");

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        //get list of student under course AE
        List<Student> studentsAE=s.stream().filter(st->st.getCourse()
                .equalsIgnoreCase("AE")).collect(Collectors.toList());
        System.out.println("List of AE students "+studentsAE);

        //sort students with name
        List<Student> sortedWithName=s.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        System.out.println("List of students sorted by name "+sortedWithName);

        //sort first with course then with name
        List<Student> sortedWithMultiple=s.stream().sorted(Comparator.comparing(Student::getCourse).thenComparing(Student::getName)).collect(Collectors.toList());
        System.out.println("List of students sorted first with course then with name "+sortedWithMultiple);


        List<Student> sta=s.stream().filter(st->c.stream()
                .anyMatch(cs->cs.getCourseName().equalsIgnoreCase(st.getCourse()))).collect(Collectors.toList());
        System.out.println("List of students with course name available in course class "+sta);

        System.out.println("Student details with min id");
        s.stream().min(Comparator.comparing(Student::getId)).ifPresent(System.out::println);
        System.out.println("Student details with max id");
        s.stream().max(Comparator.comparing(Student::getId)).ifPresent(System.out::println);

        System.out.println("grouping by course");
        Map<String,List<Student>> l1 =s.stream().collect(Collectors.groupingBy(Student::getCourse));
        l1.forEach((Course,Student)->{
            System.out.println(Course);
            System.out.println(Student);
        });
    }
}
