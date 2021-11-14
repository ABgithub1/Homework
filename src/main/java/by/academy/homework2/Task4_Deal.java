package by.academy.homework2;

/*
Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер.
Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n игроков (по 5 карт каждому) из рассортированной колоды.
Разделяйте пять карт, выданных каждому игроку, пустой строкой.
Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер.
Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n игроков (по 5 карт каждому) из рассортированной колоды.
Разделяйте пять карт, выданных каждому игроку, пустой строкой.
*/

import java.util.Scanner;

public class Task4_Deal {
    public static void main(String[] args) {
        int players = 0;
        char red = 9829;
        char peak = 9824;
        char cross = 9827;
        char bub = 9830;

        String[] cardName = {"Туз", "Двойка", "Тройка", "Четвёрка", "Пятёрка", "Шестёрка", "Семёрка",
                "Восьмёрка", "Девятка", "Десятка", "Валет", "Дама", "Король"};

        String[] cardSuit = {"Пик " + peak, "Треф " + cross, "Бубен " + bub, "Черв " + red};
        int amountOfCards = cardName.length * cardSuit.length;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите кол-во игроков");
            while (!sc.hasNextInt()) {
                System.out.println("Ошибка ввода, повторите ввод");
                sc.next();
            }
            players = sc.nextInt();
            if (players > 10) {
                System.out.println("Слишком много игроков, повторите ввод");
            }
            if (players <= 0) {
                System.out.println("Мало игроков");
            }
        } while (players <= 0 || players > 10);

        String[] deckOfCards = new String[amountOfCards];
        for (int i = 0; i < cardName.length; i++) {
            for (int j = 0; j < cardSuit.length; j++) {
                deckOfCards[cardSuit.length * i + j] = cardName[i] + " " + cardSuit[j];
            }
        }
        for (int i = 0; i < amountOfCards; i++) {
            int r = i + (int) (Math.random() * (amountOfCards - i));
            String temp = deckOfCards[r];
            deckOfCards[r] = deckOfCards[i];
            deckOfCards[i] = temp;
        }
        for (int i = 0; i < players * 5; i++) {
            System.out.println(deckOfCards[i]);
            if (i % 5 == 5 - 1)
                System.out.println();
        }
        sc.close();
    }
}