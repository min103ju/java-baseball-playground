import baseball.Baseball;
import baseball.BaseballGame;
import calculate.Calculate;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        Baseball baseball = new Baseball(baseballGame.generateNumber());
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            baseball.setInput(input);

            baseballGame.game(baseball);
            baseballGame.isComplete(baseball, scanner);
        }
    }

    //문자열 계산기
    public static void calculate() {
        Calculate calculate = new Calculate();

        String[] scanner = calculate.scanner();

        int result = Integer.parseInt(scanner[0]);
        for (int i = 1; i < scanner.length; i+=2) {
            result = calculate.operation(scanner[i], result ,Integer.parseInt(scanner[i+1]));
        }

        System.out.println("result = " + result);
    }
}
