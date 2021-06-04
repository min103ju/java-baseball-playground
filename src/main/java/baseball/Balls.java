package baseball;

import java.util.List;
import java.util.Optional;

public class Balls {
    private List<Ball> ballList;
    private int ball;
    private int strike;

    public Balls(List<Ball> ballList) {
        this.ballList = ballList;
        this.ball = 0;
        this.strike = 0;
    }

    public BallStatus play(Ball ball) {
        if (ballList.stream()
                .filter(x -> ball.play(x) == BallStatus.BALL)
                .findAny()
                .isPresent())
            return BallStatus.BALL;

        return BallStatus.NOTHING;
    }
}
