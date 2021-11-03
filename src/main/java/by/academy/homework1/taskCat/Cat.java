package by.academy.homework1.taskCat;

public class Cat {
    String nickname;
    int age;
    double money;

    public Cat() {

    }

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public Cat(String nickname, int age, double money) {
        super();
        this.nickname = nickname;
        this.age = age;
        this.money = money;
    }

    public void sleep() {
        System.out.println("Кот спит");
    }

    public void walk() {
        System.out.println("Кот гуляет");
    }

    public void eat() {
        System.out.println("Кот ест");
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMoney(double money) {
        this.money = age;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cat [nickname=");
        builder.append(nickname);
        builder.append(", age=");
        builder.append(age);
        builder.append(", money=");
        builder.append(money);
        builder.append("]");
        return builder.toString();
    }
}
