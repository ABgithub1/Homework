package by.academy.homework4.Ex2;

import java.util.Arrays;

public class MyArrayList<T> {

    private T[] listT;
    private int size;
    private final int DEFAULT_CAPACITY = 16;


    public MyArrayList() {
        listT = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Размер <= 0");
        } else {
            listT = (T[]) new Object[capacity];
        }
    }

    public void add(T obj) {
        if (size + 1 >= listT.length) {
            listT = Arrays.copyOf(listT, (listT.length * 2 + 1));
        }
        listT[size++] = obj;
    }

    public void addTObjIndex(int index, T obj) {
        for (int i = listT.length; i > index; i--) {
            listT[index] = listT[i - 1];
        }
        listT[index] = obj;
        size++;
    }

    private int index(T obj) {       // Возвр. индекс
        for (int i = 0; i < size; i++) {
            if (obj.equals(listT[i])) {
                return i;
            }
        }
        return -1;
    }

    public T[] getArray() {
        return listT;
    }

    public T get(int index) {
        return listT[index];
    }

    public T getFirst() {
        return listT[0];
    }

    public T getLast() {
        return listT[size - 1];
    }

    public void set(int index, T obj) {
        listT[index] = obj;
    }

    public void delete(int index) {
        for (int i = index; i < size; i++) {
            listT[i] = listT[i + 1];
        }
    }

    public void deleteTKey(T key) {
        int pos = index(key);
        if (pos < 0) {
            return;
        }
        delete(pos);
    }

    public void deleteOfObject(T object) {
        for (int i = 0; i < listT.length; i++) {
            if (listT[i].equals(object)) {
                listT[i] = null;
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        for (T obj : listT) {
            System.out.print(obj + " ");
        }
    }

    public void printSize() {
        System.out.println("Размер массива " + listT.length);
    }

    public void printLastTIndex() {
        int lastTIndex = 0;
        for (int i = 0; i < listT.length; i++) {
            if (listT[i] != null) {
                lastTIndex = i;
            }
        }
        System.out.println("Индекс последнего заполненного элемента " + lastTIndex);
    }

}
