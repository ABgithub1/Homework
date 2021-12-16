package by.academy.homework5;

// Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Яблоко");
        stringList.add("Яблоко");
        stringList.add("Яблоко");
        stringList.add("Яблоко");
        stringList.add("Яблоко");
        stringList.add("Груша");
        stringList.add("Груша");
        stringList.add("Груша");

        System.out.println(stringList);
        removeDuplicates(stringList);
        System.out.println(stringList);
    }

    public static List<String> removeDuplicates(List<String> list){
        Set<String> stringSet = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(stringSet);
        return list;
    }

}
