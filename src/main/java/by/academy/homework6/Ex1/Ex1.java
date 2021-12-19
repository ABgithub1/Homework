package by.academy.homework6.Ex1;

// Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл,
// если введена "stop" строка тогда закончить запись в файл.

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 'stop' для остановки ввода");
        try {
            OutputStream outputStream = new FileOutputStream("src/main/java/by/academy" +
                    "/homework6/files/Ex1File.txt");
            String input = "";
            while (!input.equals("stop")) {
                input = sc.nextLine();
                outputStream.write(input.getBytes());
            }
            outputStream.close();
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

