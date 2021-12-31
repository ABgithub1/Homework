package by.academy.homework7.Ex2;

public class User extends Person {
    private String login;
    private int password;
    private String email;

    public User(String firstName, String lastName, int age, String dateOfBirth, String login, int password, String email) {
        super(firstName, lastName, age, dateOfBirth);
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printUserInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [firstName=");
        builder.append(getFirstName());
        builder.append(", lastName=");
        builder.append(getLastName());
        builder.append(", age=");
        builder.append(getAge());
        builder.append(", dateOfBirth=");
        builder.append(getDateOfBirth());
        builder.append(", login=");
        builder.append(login);
        builder.append(", password=");
        builder.append(password);
        builder.append(", email=");
        builder.append(email);
        builder.append("]");
        System.out.println(builder.toString());
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password=" + password +
                ", email='" + email + '\'' +
                '}';
    }
}
