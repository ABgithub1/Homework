package by.academy.homework5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Заполнение ArrayList");
        timer(arrayList);

        System.out.println("Заполнение LinkedList");
        timer(linkedList);

        System.out.println("_______________________________");

        System.out.println("Взятие из ArrayList");
        timer2(arrayList);

        System.out.println("Взятие из LinkedList");
        timer2(linkedList);
    }

    public static void addRandomElements(List<Integer> list, int amount) {
        for (int i = 0; i <= amount; i++) {
            list.add((int) (i * Math.random()));
//            System.out.println(list.get(i));
        }
    }

    public static void timer(List<Integer> list) {
        long start = System.currentTimeMillis();
        addRandomElements(list, 1_000_000);
        long end = System.currentTimeMillis();
        long res = end - start;
        System.out.println("Заполнилось за :" + res + " миллисекунд");
    }

    public static void getRandomElements(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 100_000; i++) {
            list.get(random.nextInt(list.size()));
        }
    }

    public static void timer2(List<Integer> list) {
        long start = System.currentTimeMillis();
        getRandomElements(list);
        long end = System.currentTimeMillis();
        long res = end - start;
        System.out.println("Взялось за :" + res + " миллисекунд");
    }

}
