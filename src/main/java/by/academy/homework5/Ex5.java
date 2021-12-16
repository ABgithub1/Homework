package by.academy.homework5;

// Имеется текст. Следует составить для него частотный словарь:
// Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex5 {
    public static void main(String[] args) {
        String text = "Ехал Грека через реку.\n" +
                "Видит Грека в реке рак.\n" +
                "Сунул в реку руку Грека.\n" +
                "Рак за руку Греку - цап.";
        buildDictionaryWithMap(text);
    }

    public static void buildDictionaryWithMap(String text) {
        text = text.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'а' && ch <= 'я') {
                map.compute(ch, (character, integer)
                        -> integer == null ? 1 : integer + 1);
            }
        }

        ArrayList<Map.Entry<Character, Integer>> entries =
                new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
