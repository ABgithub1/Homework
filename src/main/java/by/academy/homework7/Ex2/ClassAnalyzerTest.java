package by.academy.homework7.Ex2;

import java.util.Arrays;

public class ClassAnalyzerTest {
    public static void analyzeClass(Object o) {
        Class<User> cl = User.class;
        System.out.println("Имя класса: " + cl);
        System.out.println("Поля класса: " + Arrays.toString(cl.getDeclaredFields()));
        System.out.println("Родительский класс: " + cl.getSuperclass());
        System.out.println("1 Метод класа::");
        System.out.println("Методы класса: " + Arrays.toString(cl.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(cl.getConstructors()));
        System.out.println();
        System.out.println("Имя класса: " + cl);
        System.out.println("Поля класса: " + Arrays.toString(cl.getFields()));
        System.out.println("Конструкторы класса: " + Arrays.toString(cl.getConstructors()));
        System.out.println("Методы класса: " + Arrays.toString(cl.getMethods()));

        try {
            System.out.println(cl.getMethod("printUserInfo"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        analyzeClass(new User("Vasya", "Pupkin", 20, "01.01.2002", "qwerty123", 123321, "VP323@gmail.com"));
    }
}
