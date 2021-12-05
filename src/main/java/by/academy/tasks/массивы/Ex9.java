package by.academy.tasks.массивы;

// Задача 9.
// Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
// Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
// Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.

public class Ex9 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        int num = 0;
        for (int i = 0, b = 1; b <= 4; i++) {
            if (b == 1) {
                array1[i] = (int) (Math.random() * 8) + 1;
                if (i == 0)
                    System.out.print((b) + " массив состоит из следующих элементов: ");
                System.out.print(array1[i] + " ");
                if (i == array1.length - 1) {
                    b++;
                    i = 0;
                    System.out.println(" ");
                }
            }
            if (b == 2) {
                array2[i] = (int) (Math.random() * 8) + 1;
                if (i == 0)
                    System.out.print((b) + " массив состоит из следующих элементов: ");
                System.out.print(array2[i] + " ");
                if (i == array2.length - 1) {
                    b++;
                    i = 0;
                    System.out.println(" ");
                }
            }
            if (b == 3) {
                array3[i] = (double) array1[i] / array2[i];
                if (i == 0)
                    System.out.print((b) + " массив состоит из следующих элементов: ");
                System.out.print(array3[i] + " ");
                if (i == array3.length - 1) {
                    b++;
                    i = 0;
                    System.out.println(" ");
                }
            }
            if (b == 4) {
                if (array3[i] % (int) array3[i] == 0) {
                    if (num == 0)
                        System.out.print("В 3 массиве следующие целые числа: ");
                    num++;
                    System.out.print(array3[i] + ", ");
                }
                if (i == array3.length - 1) {
                    if (num == 0)
                        System.out.println("В третьем массиве нет целых чисел!");
                    break;
                }
            }
        }
    }
}