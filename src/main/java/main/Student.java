package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private String studentName;
    private String studentNumber;
    private ArrayList<Grade> grades = new ArrayList<>();
    
    public Student(String studentName, String studentNumber){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.grades = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void printStudentList() {
        System.out.println(studentNumber + ": " + studentName);
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public void gradeList(Grade grade) {
        for (Grade listGrade : grades) {
            System.out.println(listGrade.getCourse() + ": " + listGrade.getGrade());
        }
    }

    public List<Grade> getGrade() {
        return new ArrayList<>(grades); //Sain tähän apua Eeriltä.
    }

}
