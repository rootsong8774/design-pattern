package me.rootsong.designpatterns._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    
    public static void main(String[] args) {
        Student rootsong = new Student("rootsong");
        Student whiteShip = new Student("whiteShip");
        List<Student> students = new ArrayList<>();
        students.add(rootsong);
        students.add(whiteShip);
        
        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
