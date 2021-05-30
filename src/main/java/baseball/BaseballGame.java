package baseball;

public class BaseballGame {
    public boolean strike(String number, char c, int index) {
        return number.charAt(index) == c;
    }

    public boolean ball(String number, char c) {
        return number.contains(String.valueOf(c));
    }
}
