package by.academy.homework4.Ex1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class DateMy {

    private static LocalDate localDate;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public DateMy() {
    }

    public DateMy(String date) {
        localDate = LocalDate.parse(date, formatter);
    }

    public void setLocalDate() {
        Validator dataValidator = new DataValidator();
        Scanner sc = new Scanner(System.in);
        String date = null;
        do {
            System.out.println("Введите дату (dd/MM/yyyy)");
            date = sc.nextLine();
        } while (!dataValidator.isValid(date));
        localDate = LocalDate.parse(date, formatter);
        printDate();
    }

    public void printDate() {
        System.out.println(localDate.toString());
    }

    public void CountDays() {
        LocalDate now = LocalDate.now();
        long diff = ChronoUnit.DAYS.between(localDate, now);
        System.out.println("С даты " + localDate + " до " + now + " прошло " + diff + " дней");
        System.out.println("Или " + diff / 365 + " лет");
    }

    private static class Day {
        DayOfWeek day = localDate.getDayOfWeek();

        public void printDayOfWeek() {
            switch (day) {
                case MONDAY:
                    System.out.println("Понедельник");
                    break;
                case TUESDAY:
                    System.out.println("Вторник");
                    break;
                case WEDNESDAY:
                    System.out.println("Среда");
                    break;
                case THURSDAY:
                    System.out.println("Четверг");
                    break;
                case FRIDAY:
                    System.out.println("Пятница");
                    break;
                case SATURDAY:
                    System.out.println("Суббота");
                    break;
                case SUNDAY:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.err.println("Что-то пошло не так");
                    break;
            }
        }

        public DayOfWeek getDay() {
            return day;
        }

        public void setDay(DayOfWeek day) {
            this.day = day;
        }
    }

    private static class Month {
        int month = localDate.getMonthValue();

        public void printMonth() {
            switch (month) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
            }
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }
    }

    private static class Year {
        int year = localDate.getYear();

        private boolean isLeapYear() {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        public void printYear() {
            System.out.println(year);
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    public static void main(String[] args) {
        DateMy dateMy = new DateMy();
        dateMy.setLocalDate();

        Day day = new Day();
        Year year = new Year();
        Month month = new Month();


        day.printDayOfWeek();
        month.printMonth();
        year.printYear();

        System.out.println("Високосный год ? " + year.isLeapYear());
        dateMy.CountDays();


    }


}
