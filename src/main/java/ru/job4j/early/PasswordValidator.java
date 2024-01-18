package ru.job4j.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }

        boolean hasUpCase = false;
        boolean hasLowCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char symbol : password.toCharArray()) {
            if (password.length() < 8 || password.length() > 32) {
                throw new IllegalArgumentException("Password should be length [8, 32]");
            }

            if (symbol >= 65 && symbol <= 90) {
                hasUpCase = true;
            }

            if (symbol >= 97 && symbol <= 122) {
                hasLowCase = true;
            }

            if (symbol >= 48 && symbol <= 57) {
                hasDigit = true;
            }

            if (password.matches(".*[!@#$%^&*()\\[\\]{};:,.<>?/\\\\|\\-+=].*")) {
                hasSpecial = true;
            }
        }

        for (String s : FORBIDDEN) {
            if (password.toLowerCase().contains(s.toLowerCase())) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        if (!hasUpCase) {
            throw new IllegalArgumentException(
                    "Password should contain at least one uppercase letter"
            );
        }
        if (!hasLowCase) {
            throw new IllegalArgumentException(
                    "Password should contain at least one lowercase letter"
            );
        }
        if (!hasDigit) {
            throw new IllegalArgumentException(
                    "Password should contain at least one figure"
            );
        }
        if (!hasSpecial) {
            throw new IllegalArgumentException(
                    "Password should contain at least one special symbol"
            );
        }
        return password;
    }
}
