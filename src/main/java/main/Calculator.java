package main;
//import java.lang.Math;
import java.util.List;

public class Calculator {
    private double averageGrade;


    public Calculator(double averageGrade) {
        this.averageGrade = averageGrade;
    }
    public static double getAverageGrade(List<Grade> grades) {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for(Grade grade : grades) {
            sum += grade.getGrade();
           
        }
        return sum / grades.size();
    }
// sain apua keskiarvon laskemiseen tältä sivulta https://www.cs.helsinki.fi/group/java/kesa2013/ohpe/viikko3/#46lukujen_keskiarvo, sekä chatgpt:ltä.
   

    
}
