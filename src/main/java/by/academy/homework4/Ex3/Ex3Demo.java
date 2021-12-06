package by.academy.homework4.Ex3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ex3Demo {
    private static <T> Iterator<T> getIterator(final T[] array) {
        return new Iterator<>() {
            private final int count = array.length;
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (index < count) {
                    return array[index++];
                } else {
                    throw new NoSuchElementException("Нет такого элемента");
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Невозможно удалить элемент из массива");
            }
        };
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{3, 6, 5, 7, 4, 5};
        Double[] doubles = new Double[]{0.1, 0.2, 0.3};
        String[] strings = new String[]{"Яблоко", "Груша", "Гранат"};

        Iterator<Integer> integerIterator = getIterator(integers);

        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        Iterator<Double> doubleIterator = getIterator(doubles);
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }

        Iterator<String> stringIterator = getIterator(strings);
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

    }
}
