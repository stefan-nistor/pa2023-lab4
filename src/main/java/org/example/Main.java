package org.example;

import org.example.models.Project;
import org.example.models.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    static List<Student> students = new LinkedList<>();
    static Set<Project> projects = new TreeSet<>();


    public static void main(String[] args) {

        students = IntStream.rangeClosed(0, 3)
                .mapToObj(index -> new Student("S" + index))
                .collect(Collectors.toList());

        projects = IntStream.rangeClosed(0, 3)
                .mapToObj(index -> new Project("P" + index))
                .collect(Collectors.toSet());


        System.out.println(students.toString());
        System.out.println(projects.toString());
    }
}