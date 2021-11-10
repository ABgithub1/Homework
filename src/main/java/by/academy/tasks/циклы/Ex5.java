package by.academy.tasks.циклы;

/*
5. Составьте программы перевода старинных русских мер длины, торгового и аптекарского веса(счетчик цикла от 1 до 10)
        * саженей в метры(1 сажень равна 2,1366 м)
        * из дюймов в сантиметры(1 дюйм равен 2,5 см)
        * футов в метры(1 фут равен 0,3048 м)
        * драхм в граммы(1 драхма равна 3,7325 г)
        * унций в граммы(1 унция равна 29,86 г)
        * фунтов в килограммы(1 фунт равен 0,40951 кг)
        * аршинов в метры(1 аршин равен 0,7112 м)
        * золотников в граммы(1 золотник равен 4,2657 г)
        * дюймов в миллиметры(1 дюйм равен 25,3995 мм)
*/

public class Ex5 {
    public static void main(String[] args) {

        sajenyToMeters();
        System.out.println();
        inchesToСentimeters();
        System.out.println();
        futToMeters();
        System.out.println();
        draxmToGramm();
        System.out.println();
        unciaToGramm();
        System.out.println();
        funtToKillo();
        System.out.println();
        arshTometers();
        System.out.println();
        zolotnToGramm();
        System.out.println();
        inchesToMillimeters();

    }

    static void sajenyToMeters() {
        double sajny = 2.1366;
        double res;
        for (int i = 1; i <= 10; i++) {
            res = sajny * i;
            System.out.println(i + " Саженей = " + res + " м");
        }
    }

    static void inchesToСentimeters() {
        double inches = 2.5;
        double res;
        for (int i = 1; i <= 10; i++) {
            res = inches * i;
            System.out.println(i + " Дюймов = " + res + " см");
        }
    }

    static void futToMeters() {
        double fut = 0.3048;
        double res;
        for (int i = 1; i <= 10; i++) {
            res = fut * i;
            System.out.println(i + " Футов = " + res + " м");
        }
    }

    static void draxmToGramm() {
        double draxm = 3.7325;
        double res;
        for (int i = 1; i <= 10; i++) {
            res = draxm * i;
            System.out.println(i + " Драхм = " + res + " гр");
        }
    }

    static void unciaToGramm() {
        double draxm = 29.86;
        double res;
        for (int i = 1; i <= 10; i++) {
            res = draxm * i;
            System.out.println(i + " Унция = " + res + " гр");
        }
    }

    static void funtToKillo() {
        double funt = 0.40951;
        double res;
        for (int i = 1; i <= 10; i++) {
            res = funt * i;
            System.out.println(i + " Фунтов = " + res + " кг");
        }
    }

    static void arshTometers() {
        double arsh = 0.7112;
        double res;
        for (int i = 1; i <= 10; i++) {
            res = arsh * i;
            System.out.println(i + " Аршинов = " + res + " м");
        }
    }

    static void zolotnToGramm() {
        double zolot = 4.2657;
        double res;
        for (int i = 1; i <= 10; i++) {
            res = zolot * i;
            System.out.println(i + " Золотников = " + res + " гр");
        }
    }

    static void inchesToMillimeters() {
        double inches = 25.3995;
        double res;
        for (int i = 1; i <= 10; i++) {
            res = inches * i;
            System.out.println(i + " Дюймов = " + res + " мм");
        }
    }
}

