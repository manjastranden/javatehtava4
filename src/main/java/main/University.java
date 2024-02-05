package main;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class University {
    private ArrayList<Student> students = new ArrayList<>();
    final private String FILENAME;

    public University() {
        FILENAME ="savedStudents.data";
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void listStudents() {
        System.out.println("Opiskelijat:");
        for (Student student : students) {
            student.printStudentList();
        }
    }

    public void listID() {
        for (int i = 0; i < students.size(); ++i) {
            System.out.println(i + ": " + students.get(i).getStudentName());

        }
    }

    public Student getID(int index) {
        return students.get(index);
    }

    public void saveStudents() {
        try {
            ObjectOutputStream studentWriter = new ObjectOutputStream(new FileOutputStream(FILENAME));
            studentWriter.writeObject(students);
            studentWriter.close();
        } catch (IOException e) {
            System.out.println("Opiskelijoiden tallentaminen ei onnistunut");
            e.printStackTrace();
        }
        
    }
    public void loadStudents() {
        try {
            ObjectInputStream studentReader = new ObjectInputStream(new FileInputStream(FILENAME));
            students = (ArrayList<Student>) studentReader.readObject();
            studentReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");

        } catch (IOException e) {
            System.out.println("Opiskelijoiden tallentaminen ei onnistunut");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
