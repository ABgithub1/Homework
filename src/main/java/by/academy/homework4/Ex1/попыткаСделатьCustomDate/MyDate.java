package by.academy.homework4.Ex1.попыткаСделатьCustomDate;

public class MyDate {
    private int day;
    private String month;
    private int year;

    public MyDate() {
        this(1, "января", 2000); //Пустой конструктор будет контр. по умолчанию
    }

    public MyDate(int day, String month, int year) {
        setDate(day, month, year);
    }

    public MyDate(int day, int monthNumber, int year) {
        setDate(day, monthNumber, year);
    }

    public MyDate(MyDate original) { // конструктор копии
        if (original == null) {
            System.err.println("Ошибка, объект нулевой даты");
            System.exit(0);
        }
        setDate(original.day, original.month, original.year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        switch (month.toLowerCase()) {
            case "январь":
                return 1;
            case "февраль":
                return 2;
            case "март":
                return 3;
            case "апрель":
                return 4;
            case "май":
                return 5;
            case "июнь":
                return 6;
            case "июль":
                return 7;
            case "август":
                return 8;
            case "сентябрь":
                return 9;
            case "октябрь":
                return 10;
            case "ноябрь":
                return 11;
            case "декабрь":
                return 12;
            default:
                return 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (!dateOK(day, month, year)) {
            System.err.println("Ошибка, неправильный день");
        }
        this.day = day;
    }

    public void setMonth(String month) {
        if (!dateOK(day, month, year)) {
            System.err.println("Ошибка, неправильный месяц");
        }
        this.month = month;
    }

    public void setMonth(int monthNumber) {
        if (!dateOK(day, monthNumber, year)) {
            System.err.println("Ошибка, неправильный номер месяца");
        }
        this.month = monthString(monthNumber);
    }

    public void setYear(int year) {
        if (!dateOK(day, month, year)) {
            System.err.println("Ошибка, неправильный год");
        }
        this.year = year;
    }

    public void setDate(int day, String month, int year) {
        if (!dateOK(day, month, year)) {
            System.err.println("Ошибка, неправильная дата");
            System.exit(0);
        }
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public void setDate(int day, int monthNumber, int year) {
        if (!dateOK(day, monthNumber, year)) {
            System.err.println("Ошибка, неправильная дата");
            System.exit(0);
        }
        this.day = day;
        this.year = year;
        this.month = monthString(monthNumber);
    }

    public boolean equals(MyDate otherMyDate) {
        return (day == otherMyDate.day && getMonth() ==
                otherMyDate.getMonth() && year == otherMyDate.year);
    }

    public String toString() {
        return month + " " + day + " " + year;
    }

    public boolean precedes(MyDate otherMyDate) {
        return (year < otherMyDate.year)
                || (year == otherMyDate.year
                && getMonth() < otherMyDate.getMonth())
                || (year == otherMyDate.year
                && getMonth() == otherMyDate.getMonth()
                && day < otherMyDate.day);
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static String monthString(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "январь";
            case 2:
                return "февраль";
            case 3:
                return "март";
            case 4:
                return "апрель";
            case 5:
                return "май";
            case 6:
                return "июнь";
            case 7:
                return "июль";
            case 8:
                return "август";
            case 9:
                return "сентябрь";
            case 10:
                return "октябрь";
            case 11:
                return "ноябрь";
            case 12:
                return "декабрь";
            default:
                return "Что-то пошло как обычно";
        }
    }

    private static boolean dateOK(int day, String month, int year) {
        if (year < 1000 || year > 9999) {
            return false;
        }
        switch (month.toLowerCase()) {
            case "январь":
            case "февраль":
                if (isLeapYear(year)) {
                    return (day >= 1 && day <= 29);
                } else {
                    return (day >= 1 && day <= 28);
                }
            case "март":
            case "апрель":
            case "май":
            case "июнь":
            case "июль":
            case "август":
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                return (day >= 1 && day <= 31);
            case "декабрь":
                return (day >= 1 && day <= 31);
            default:
                return false;

        }
    }

    private static boolean dateOK(int day, int monthNumber, int year) {
        String monthString = monthString(monthNumber);
        return dateOK(day, monthNumber, year);
    }

}
