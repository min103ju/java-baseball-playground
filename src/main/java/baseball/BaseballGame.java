package baseball;

import java.util.Scanner;

public class BaseballGame {
//
//    public String scanner() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }

    public String generateNumber() {
        int random = (int) ((Math.random() * (1000 - 100)) + 100);
        System.out.println("random = " + random);
        return String.valueOf(random);
    }

    public void strike(Baseball baseball, char c, int index) {
        if (baseball.getNumber().charAt(index) == c) {
            baseball.strike();
        }
    }

    public void ball(Baseball baseball, char c, int index) {
        if (baseball.getNumber().charAt(index) != c &&
                baseball.getNumber().contains(String.valueOf(c))) {
            baseball.ball();
        }
    }

    public void isComplete(Baseball baseball, Scanner scanner) {
        if (baseball.getStrike() == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            isRestart(baseball, scanner.nextLine(), scanner);
        }
        baseball.clear();
    }

    public void isRestart(Baseball baseball, String flag, Scanner scanner) {
        if(flag.equals("1")) baseball.setNumber(generateNumber());
        if(flag.equals("2")) scanner.close();
    }

    public void game(Baseball baseball) {
        char[] chars = baseball.getInput().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            strike(baseball, chars[i], i);
            ball(baseball, chars[i], i);
        }

        if(baseball.getBall() > 0) System.out.print(baseball.getBall() + "볼 ");
        if(baseball.getStrike() > 0) System.out.print(baseball.getStrike() + "스트라이크");
    }
}
