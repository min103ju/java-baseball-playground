package baseball;

import java.util.Scanner;

public class BaseballGame {
//
//    public String scanner() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }

    public boolean strike(String number, char c, int index) {
        return number.charAt(index) == c;
    }

    public boolean ball(String number, char c) {
        return number.contains(String.valueOf(c));
    }

    public boolean complete(Baseball baseball) {
        return baseball.getStrike() == 3;
    }
}
