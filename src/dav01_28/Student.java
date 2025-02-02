package dav01_28;

import java.util.ArrayList;

public class Student
{
    private String name;
    private String lastName;
    private String date;
    private ArrayList<Integer> grades;

    public Student(String name, String lastName, String date, ArrayList<Integer> grades) {
        this.name = name;
        this.lastName = lastName;
        this.date = date;
        this.grades = grades;
    }
    public double score() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String  getDate() {
        return date;
    }

    public double getScore() {
        return score();
    }

    @Override
    public String toString() {
        return  name+","+lastName+","+date+","+score();
    }
}


