package by.academy.homework7.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();

        repeat(100, () -> list.add((long) (rnd(100) * Math.PI - 20)));
        Map<Long, String> map = list.stream().filter(n -> n < 100).sorted().skip(3).collect(Collectors.toMap(o -> o, t -> "Number: " + t, (a1, a2) -> a1));

        System.out.println(map);

    }

    static void repeat(int n, Runnable r) {
        for (int i = 0; i < n; i++)
            r.run();
    }

    public static long rnd(int max) {
        return (long) (Math.random() * ++max);
    }

}
