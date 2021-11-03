package by.academy.homework1.taskCat;

public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat("Basilio", 60, 3);
        System.out.println(cat);
        cat.sleep();
        cat.eat();
        cat.walk();
    }
}
