package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final ArrayList<Ball> answers;

    public Balls(List<Integer> balls) {
        answers = mapBalls(balls);
    }

    private ArrayList<Ball> mapBalls(List<Integer> balls) {
        ArrayList<Ball> answers = new ArrayList<Ball>();
        for (int i = 0; i < 3; i++) {
            answers.add(new Ball(i + 1, balls.get(i)));
        }
        return answers;
    }

    public BallStatus play(Ball ball) {
        return answers.stream()
                .map(answer -> answer.play(ball))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public PlayResult play(List<Integer> userBalls) {
        Balls balls = new Balls(userBalls);
        PlayResult result = new PlayResult();

        for (Ball answer : answers) {
            result.report(balls.play(answer));
        }

        return result;
    }
}
