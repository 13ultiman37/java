package ru.mirea.ikbo1319.pr13;

import java.util.ArrayList;

public class Main13 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student st1 = new Student(12, "Ivan Ivanov", 3.5);
        Student st2 = new Student(24, "Sergey Sergeev", 4.77);
        Student st3 = new Student(354, "Dmitri Dmitriev", 2.9);
        Student st4 = new Student(4, "Oleg Olegov", 3.63);
        Student st5 = new Student(8, "Nikita Nikitin", 4.78);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        students.sort(sort);
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}
