package by.academy.tasks.массивы;

// Задача 8.
// Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
// Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

public class Ex8 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int mMax = 0;
        int iMax = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 32) - 16); //(0.9*1число)-2число || (0*1число)-2число = -15...15

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] > mMax) {
                mMax = array[i];
                iMax = i;
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент = " + mMax + " индeкс вхождения в массив = " + iMax);

    }
}
