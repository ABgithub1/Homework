package by.academy.homework7.Ex2;

import java.util.Arrays;

public class ClassAnalyzer {
    public static void analyzeClass(Object o) {
        Class cl = o.getClass();
        System.out.println("Имя класса: " + cl);
        System.out.println("Поля класса: " + Arrays.toString(cl.getDeclaredFields()));
        System.out.println("Родительский класс: " + cl.getSuperclass());
        System.out.println("Методы класса: " + Arrays.toString(cl.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(cl.getConstructors()));
        System.out.println();
        System.out.println(cl);
        System.out.println(Arrays.toString(cl.getFields()));
        System.out.println(Arrays.toString(cl.getConstructors()));
        System.out.println(Arrays.toString(cl.getMethods()));

    }

    public static void main(String[] args) {
        analyzeClass(new User("Vasya", "Pupkin", 20, "01.01.2002", "qwerty123", 123321, "VP323@gmail.com"));
    }
}
