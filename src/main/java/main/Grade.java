package main;

import java.io.Serializable;

public class Grade implements Serializable{
    private int gradeint;
    private String course;
    
    public Grade(int gradeint, String course) {
        this.gradeint = gradeint;
        this.course = course;
    }

    public int getGrade() {
        return gradeint;
    }

    public String getCourse() {
        return course;
    }
}
