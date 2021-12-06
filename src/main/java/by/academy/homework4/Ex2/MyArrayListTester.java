package by.academy.homework4.Ex2;

public class MyArrayListTester {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(99);
        myArrayList.delete(0);
        myArrayList.deleteTKey((Integer) 99);
        myArrayList.set(10, 10_000);
        myArrayList.set(0, 333);
        myArrayList.set(1, 222);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);
        myArrayList.add(11);
        myArrayList.add(12);
        myArrayList.add(500);
        myArrayList.add(500);
        myArrayList.add(500);
        myArrayList.add(500);
        myArrayList.add(500);
        System.out.println(myArrayList.getLast());
        System.out.println(myArrayList.getFirst());
        myArrayList.printLastTIndex();

        myArrayList.print();
    }
}
