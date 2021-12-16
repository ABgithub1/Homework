package by.academy.homework5.Ex3;

// Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
// Протестировать в main.

public class Main {
    public static void main(String[] args) {
        Integer[][] myArray = {{100, 200, 300}, {10, 20, 30}, {99, 333, 227}};
//         System.out.println(Arrays.deepToString(myArray));
        Array2Iterator<Integer> iterator = new Array2Iterator<>(myArray);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
