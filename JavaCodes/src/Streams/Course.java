package Streams;

public class Course {
    private int courseId;
    private String courseName;

    Course(int courseId,String courseName){
        this.courseName=courseName;
        this.courseId=courseId;
    }
    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }
    public String toString(){//overriding the toString() method
        return courseId+" "+courseName;
    }
}
