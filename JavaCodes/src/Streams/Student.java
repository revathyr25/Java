package Streams;

public class Student {
    private int id;
    private String name;
    private String course;
    Student(int id,String name,String course){
        this.id=id;
        this.name=name;
        this.course=course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }
    public String toString(){//overriding the toString() method
        return id+" "+name+" "+course;
    }
}
