package by.academy.homework6.Ex4;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Ex4 {

    public static void main(String[] args) {
        createFolder();
//      createFiles();
        doIt();
    }

    protected static void doIt() {
        File fileEx2 = new File("src/main/java/by/academy/homework6/files/Ex2File.txt");

        for (int i = 1; i <= 100; i++) {
            try {
                InputStream inputStream = new FileInputStream(fileEx2);
                String fileStr = readStream(inputStream).substring(0, (int) (Math.random() * fileEx2.length() + 1));
//                System.out.println(fileStr);
                byte[] buffer = fileStr.getBytes();
                FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/by/academy" +
                        "/homework6/Ex4/Ex4Folder/" + i + ".txt");
                fileOutputStream.write(buffer);
                FileWriter fw = new FileWriter("src/main/java/by/academy/homework6/Ex4/Result.txt", true);
                fw.write("Файл " + i + ", Размер файла: " + buffer.length + "\n");
                fw.close();
                inputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected static String readStream(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder(512);
        Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);
        int ch;
        while ((ch = reader.read()) != -1) {
            sb.append((char) ch);
        }
        reader.close();
        return sb.toString();
    }

//    protected static void createFiles() {                     Создаются и без этого
//        for (int i = 1; i <= 100; i++) {
//            try {
//                OutputStream outputStream = new FileOutputStream("src/main/java/by/allKindsOfThings/exercises" +
//                        "/homework/homework6/Ex4/Ex4Folder/" + i + ".txt");
//                outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("Создано 100 txt файлов");
//    }

    protected static void createFolder() {
        File theDir = new File("src/main/java/by/academy/homework6/Ex4/Ex4Folder");
        if (!theDir.exists()) {
            System.out.println("Создание папки: " + theDir.getName());
            boolean result = false;
            try {
                theDir.mkdir();
                result = true;
            } catch (SecurityException se) {
                System.err.println("SecurityException se");
            }
            if (result) {
                System.out.println("Создана папка Ex4Folder");
            }
        }
    }
}
