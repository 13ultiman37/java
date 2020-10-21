package ru.mirea.ikbo1319.pr14;

import java.util.Comparator;

public class Student implements Comparator  {
    private int id;

    public Student(int id){
        this.id = id;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return this.id == student.getId();
    }

    public int getId() {
        return id;
    }
}