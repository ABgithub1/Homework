package by.academy.homework6.Ex2;

// Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.

import java.io.*;

public class Ex2 {
    public static void main(String[] args) {
        try {
            Reader reader = new BufferedReader(new FileReader("src/main/java/by/academy" +
                    "/homework6/files/Ex2File.txt"));  // sourceFile
            Writer writer = new BufferedWriter(new FileWriter("src/main/java/by/academy" +
                    "/homework6/files/Ex2Res.txt"));   // resultFile

            int ch;
            while ((ch = reader.read()) != -1) {
                if (Character.isAlphabetic(ch)) {
                    writer.write(ch);
                }
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
