package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Student> ArrayList;

    public static void main(String[] args) {
        Student student1 = new Student("Mari", "Y113", 3, new ArrayList<>(Arrays.asList(4, 5, 4, 3, 5)));
        Student student2 = new Student("Petr", "K114", 2, new ArrayList<>(Arrays.asList(4, 3, 3, 2, 3)));
        Student student3 = new Student("Dasha", "M112", 4, new ArrayList<>(Arrays.asList(4, 4, 5, 4, 5)));
        Student student4 = new Student("Kolya", "P113", 3, new ArrayList<>(Arrays.asList(3, 2, 2, 3, 3)));
        Student student5 = new Student("Kate", "Y112", 4, new ArrayList<>(Arrays.asList(4, 5, 5, 3, 5)));
        Student student6 = new Student("Igor", "M113", 3, new ArrayList<>(Arrays.asList(3, 4, 3, 2, 2)));
        Student student7 = new Student("Vladimir", "Y113", 3, new ArrayList<>(Arrays.asList(5, 4, 3, 4, 4)));
        Student student8 = new Student("Mery", "Y114", 2, new ArrayList<>(Arrays.asList(4, 4, 5, 4, 3)));

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);

        for (Student student : students) {
            System.out.println(student); //выводим список студентов со всеми данными

        }

        University university = new University(students);


        //вызываем метод для перевода на след курс
        List<Student> studentWhoMoveToNextCourse = new ArrayList<>();
        university.moveToNextCourseStudents(studentWhoMoveToNextCourse, students);

        //вызываем метод для удаление из списка тех,кого отчислили
        List<Student> studentsWhoExpelled = new ArrayList<>();
        university.removeStudentsWithAverageScoreLessThanThree(studentsWhoExpelled, students);
        studentsWhoExpelled.clear();

        
    }
}

