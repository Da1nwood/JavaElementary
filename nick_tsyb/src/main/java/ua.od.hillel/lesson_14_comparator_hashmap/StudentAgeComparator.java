package ua.od.hillel.lesson_14_comparator_hashmap;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
