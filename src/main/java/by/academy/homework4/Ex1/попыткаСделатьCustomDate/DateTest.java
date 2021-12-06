package by.academy.homework4.Ex1.попыткаСделатьCustomDate;


import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        MyDate myBirthDate = new MyDate(9, "июнь", 2002);
        MyDate somebodyBirthDate = new MyDate(1, "май", 1977);
        MyDate somebodyBirthDateCopy = new MyDate(somebodyBirthDate);
        somebodyBirthDate.setYear(2002);

        MyDate testDate = new MyDate();
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.nextLine();


        System.out.println("Моя дата рождения " + myBirthDate);
        System.out.println("Чья-то дата рождения " + somebodyBirthDate);
        System.out.println("Проверка копирования " + somebodyBirthDateCopy);
        System.out.println("Високосный ? ");

        if (myBirthDate.precedes(somebodyBirthDate)) {
            System.out.println(myBirthDate + " precedes " + somebodyBirthDate);
        } else {
            System.out.println(somebodyBirthDate + " precedes " + myBirthDate);
        }
        if (myBirthDate.equals(somebodyBirthDate)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
        myBirthDate.setDate(1, "май", 1960);
        System.out.println(myBirthDate);
        System.out.println(myBirthDate.getDay());
        System.out.println(myBirthDate.getYear());
        System.out.println(myBirthDate.getMonth());


    }
}
