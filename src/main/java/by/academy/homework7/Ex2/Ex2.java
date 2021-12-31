package by.academy.homework7.Ex2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) {
        User user = new User("Vasya", "Pupkin", 20, "01.01.2002", "qwerty123", 123321, "VP323@gmail.com");
        System.out.println();
        Class myClass = user.getClass();
        System.out.println(myClass);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());

        System.out.println("_____Поля_____");
        Field[] fields = myClass.getFields();
        for (Field field : fields) {
            System.out.println("\t" + myClass.getModifiers() + field.getType() + " " + field.getName() + ";");
        }

        System.out.println("_____Методы_____");
        Method[] methods = myClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("_____Интерфейсы_____");
        Class[] interfaces = myClass.getInterfaces(); //  (их нет)
        for (int i = 0, size = interfaces.length; i < size; i++) {
            System.out.print(i == 0 ? "implements " : ", ");
            System.out.print(interfaces[i].getSimpleName());
        }

        System.out.println("_____Declared поля_____");
        Field[] fields1 = myClass.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field.getName());
        }

        System.out.println("_____Declared поля по названию_____");
        try {
            System.out.println(myClass.getDeclaredField("login").getName());
            System.out.println(myClass.getDeclaredField("password").getName());
            System.out.println(myClass.getDeclaredField("email").getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        System.out.println("get & set для полей");
        try {
            Field field1 = myClass.getDeclaredField("login");
            field1.setAccessible(true);
            field1.set(user, "newLogin123");
            System.out.println(field1.get(user));

            Field fields2 = myClass.getDeclaredField("password");
            fields2.setAccessible(true);
            fields2.set(user, 1234567);

            Field field3 = myClass.getDeclaredField("email");
            field3.setAccessible(true);
            field3.set(user, "newEmail@pochta.by");
            System.out.println(field3.get(user));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("_____Invoke_____");
        try {
            System.out.println(myClass.getMethod("toString").invoke(user));
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
