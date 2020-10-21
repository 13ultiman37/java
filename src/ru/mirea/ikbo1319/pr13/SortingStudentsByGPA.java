package ru.mirea.ikbo1319.pr13;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student n1, Student n2)
    {
        return (n1.getGpa() < n2.getGpa()) ? 1 : -1;
    }
}
