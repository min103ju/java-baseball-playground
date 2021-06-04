package baseball;

import java.util.List;

public class Balls {
    private List<Ball> ballList;
    private int ball;
    private int strike;

    public Balls(List<Ball> ballList) {
        this.ballList = ballList;
        this.ball = 0;
        this.strike = 0;
    }

    public void play(Ball ball) {

        if (ballList.stream()
                .filter(x -> ball.play(x) == BallStatus.STRIKE)
                .findAny()
                .isPresent()) {
            this.strike++;
        }

        if (ballList.stream()
                .filter(x -> ball.play(x) == BallStatus.BALL)
                .findAny()
                .isPresent()) {
            this.ball++;
        }
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public void plays(Balls userBalls) {
        this.ballList.forEach(
                com -> userBalls.play(com)
        );
    }
}
