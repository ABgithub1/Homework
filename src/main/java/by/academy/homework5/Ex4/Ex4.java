package by.academy.homework5.Ex4;

//   Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//   Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Vasya", 2 + (int) (Math.random() * ((10 - 2) + 1))));
        studentList.add(new Student("Nikita", 2 + (int) (Math.random() * ((10 - 2) + 1))));
        studentList.add(new Student("Masha", 2 + (int) (Math.random() * ((10 - 2) + 1))));
        studentList.add(new Student("Petya", 2 + (int) (Math.random() * ((10 - 2) + 1))));
        studentList.add(new Student("Gena", 2 + (int) (Math.random() * ((10 - 2) + 1))));
        studentList.add(new Student("Alexei", 2 + (int) (Math.random() * ((10 - 2) + 1))));

        System.out.println(studentList);

        Iterator<Student> iterator = studentList.iterator();

        int min = studentList.get(0).getMark();
        int max = studentList.get(0).getMark();
        List<String> minMarkStud = new ArrayList<>();
        List<String> maxMarkStud = new ArrayList<>();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getMark() < min) {
                min = student.getMark();
            }
            if (student.getMark() > max) {
                max = student.getMark();
            }
        }
        for (Student student : studentList) {
            if (student.getMark() == min) {
                minMarkStud.add(student.getName());
            }
            if (student.getMark() == max) {
                maxMarkStud.add(student.getName());
            }
        }
        System.out.println("Самая низкая отметка " + min + " у: " + minMarkStud);
        System.out.println("Самая высокая отметка " + max + " у: " + maxMarkStud);
    }
}