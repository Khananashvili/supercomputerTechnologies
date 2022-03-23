package lesson7_8;

import java.util.Objects;

public class User {
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String login, password;
    public Basket purchased;

    boolean isAuth(String login, String password) {
        return Objects.equals(this.login, login) && Objects.equals(this.password, password);
    }
}
