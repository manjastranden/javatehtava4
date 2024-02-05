package main;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) {
        
        Scanner sc = new Scanner(System.in);
        
        University university = new University();
       // Calculator calculator = new Calculator();
        Grade grade = null;

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelija tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");
            
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Anna opiskelijan nimi?");
                        String studentName = sc.nextLine();
                        System.out.println("Anna opiskelijanumero");
                        String studentNumber = sc.nextLine();
                        Student newStudent = new Student(studentName, studentNumber);
                        university.addStudent(newStudent);
                        break;
                    
                    case 2:
                        university.listStudents();
                        break;

                    case 3:
                        university.listID();
                        System.out.println("Mille opiskelijalle suorite lisätään?");
                        String studentIndex = sc.nextLine();
                        int student = Integer.parseInt(studentIndex);
                        Student newStudent2 = university.getID(student);

                        System.out.println("Mille kurssille suorite lisätään?");
                        String course = sc.nextLine();

                        System.out.println("Mikä arvosana kurssille lisätään?");
                        String gradeString = sc.nextLine();
                        int gradeint = Integer.parseInt(gradeString);
                        Grade grade2 = new Grade(gradeint, course);
                        newStudent2.addGrade(grade2);
                        break;

                    case 4:
                        university.listID();
                        System.out.println("Minkä opiskelijan suoritteet listataan?");
                        String stringStudent = sc.nextLine();
                        int intStudent = Integer.parseInt(stringStudent);
                        Student newStudent3 = university.getID(intStudent);
                        newStudent3.gradeList(grade);
                        break;
                    case 5:
                        university.listID();
                        System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                        String student1 = sc.nextLine();
                        int intStudent1 = Integer.parseInt(student1);
                        Student student2 = university.getID(intStudent1);
                        double averageGrade = Calculator.getAverageGrade(student2.getGrade());
                        System.out.println("Keskiarvo on " + averageGrade);
                        break;
                    case 6:
                       // System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                       break;
                    case 7:
                        university.saveStudents();
                        break;
                    case 8:
                        university.loadStudents();
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                }
           }
        }
    sc.close();    
    }       
}
