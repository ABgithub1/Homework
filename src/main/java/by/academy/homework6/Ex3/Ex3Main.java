package by.academy.homework6.Ex3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex3Main {
    public static void main(String[] args) {
        createFolder();
        writeUserInfo(createUserList());
    }

    protected static List<User> createUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Василий", "Васильев", 20));
        userList.add(new User("Иван", "Иванов", 25));
        userList.add(new User("Мария", "Иванова", 23));
        userList.add(new User("Андрей", "Андреев", 19));
        userList.add(new User("Александр", "Александров", 55));
        userList.add(new User("Валерий", "Жмышенко", 54));
        userList.add(new User("Пётр", "Петров", 35));
        userList.add(new User("Иван", "Иванов1", 25));
        userList.add(new User("Иван", "Иванов2", 25));
        userList.add(new User("Иван", "Иванов3", 25));
        return userList;
    }

    protected static void writeUserInfo(List<User> userList) {
        try {
            for (User user : userList) {
                FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/by/academy/homework6/Ex3/Users/"
                        + user.getName() + "_" + user.getSurname() + ".txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(user);
                fileOutputStream.close();
                objectOutputStream.close();
            }
            System.out.println("Завершена запись в папку Users");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static void createFolder() {
        File theDir = new File("src/main/java/by/academy/homework6/Ex3/Users");
        if (!theDir.exists()) {
            System.out.println("Создание папки: " + theDir.getName());
            boolean result = false;
            try {
                theDir.mkdir();
                result = true;
            } catch (SecurityException se) {
                System.err.println("Ошибка");
            }
            if (result) {
                System.out.println("Создана папка Users");
            }
        }
    }
}
