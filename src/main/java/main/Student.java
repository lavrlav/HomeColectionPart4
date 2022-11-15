package main;

import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> marks;

    public Student(String name, String group, int course, List<Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }


    public String getName() {
        return name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    //метод, который считает средний балл студента
    public double averageScore() {
        double sum = 0;
        for (int i : marks) {
            sum += i;
        }
        double result = sum / marks.size();
        System.out.println(getName() + " средний балл " + result);
        return sum;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }


}

