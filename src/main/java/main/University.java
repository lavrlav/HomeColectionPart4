package main;

import java.util.List;
import java.util.Scanner;

public class University {
    private List<Student> students;

    public University(List<Student> students) {this.students = students;}

    public List<Student> getStudents() {return students;}


    //метод 1, который переводит студента на следующий курс
    public void moveToNextCourseStudents(List<Student> studentWhoMoveToNextCourse, List<Student> students) {
        for (Student student : students) {
            if (student.averageScore() >= 3) {
                student.setCourse(student.getCourse() + 1);
                studentWhoMoveToNextCourse.add(student);
            }
        }System.out.println("new list: " + studentWhoMoveToNextCourse);
    }


    //метод 2, который удаляет студента,если средний бал ниже 3
    public void removeStudentsWithAverageScoreLessThanThree(List<Student> studentsWhoExpelled,List<Student> students) {
        for (Student student : students) {
            if (student.averageScore() < 3) {
                studentsWhoExpelled.add(student);
            }
        }System.out.println("которые на отчисление: " + studentsWhoExpelled);
    }

    public void printStudents(List<Student> students, int course){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter course");
        int courseInput = sc.nextInt();
        for(Student student: students){
            if(courseInput == course) {
                System.out.println(student.getName());
            }else{
                System.out.println("no student on this course");
            }

        }
    }



    @Override
    public String toString() {
        return "University{" +
                "students=" + students +
                '}';
    }
}
