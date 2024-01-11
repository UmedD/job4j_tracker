package ru.job4j.ex;

public class User {
    private String surname;
    private boolean valid;

    public User(String surname, boolean valid) {
        this.surname = surname;
        this.valid = valid;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isValid() {
        return valid;
    }
}
