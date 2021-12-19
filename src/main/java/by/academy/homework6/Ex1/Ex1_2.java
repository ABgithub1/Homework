package by.academy.homework6.Ex1;

// Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл,
// если введена "stop" строка тогда закончить запись в файл.

import java.io.*;

public class Ex1_2 {
    public static void main(String[] args) {
        System.out.println("Введите 'stop' для остановки ввода");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/by/academy" +
                     "/homework6/files/Ex1File.txt"))) {
            String text;
            while (!(text = br.readLine()).equals("stop")) {

                bw.write(text + " ");
                bw.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

