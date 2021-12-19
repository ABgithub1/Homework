package by.academy.homework6.Ex2;

// Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_2 {
    public static void main(String[] args) {

        File inputFile = new File("src/main/java/by/academy" +
                "/homework6/files/Ex2File.txt");

        File outputFile = new File("src/main/java/by/" +
                "academy/homework6/files/Ex2Res.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            int ch;
            while ((ch = fileInputStream.read()) != -1) {
                if ((char) ch == ' ') {
                    fileOutputStream.write('_');
                } else {
                    fileOutputStream.write(ch);
                }
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

