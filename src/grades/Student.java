package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    public static void main(String[] args) {

        ArrayList<Integer> grade = new ArrayList<>(Arrays.asList(90, 80, 70));


        Student ashley = new Student("ashley", grade);
        ashley.getGradeAverage();
        ashley.addGrade(85);
        ashley.getGradeAverage();

    }

    private String names;
    private ArrayList<Integer> grades;

    public Student(String names, ArrayList<Integer> grades) {
        this.names = names;
        this.grades = grades;
    }

    public String getNames() {
        return names;
    }


    // adds the given grade to the grades property
    public void addGrade(int grade){

        grades.add(grade);

    }

    public String printGrades() {

        return grades.toString().replaceAll("\\[|\\]", "");

    }


    // returns the average of the students grades
    public double getGradeAverage(){

        double average = 0.0;
        for (int i = 0; i < grades.size(); i++)  {
            average += grades.get(i);
        }
        return average/grades.size();

    }



}
