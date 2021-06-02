package baseball;

import java.util.Objects;

public class Ball {

    private int index;
    private int number;

    public Ball(int index, int number) {
        this.index = index;
        this.number = number;
    }

    public BallStatus play(Ball userBall) {
        if (userBall.equals(this)) {
            return BallStatus.STRIKE;
        }
        if (userBall.isBall(this)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean isBall(Ball ball) {
        return this.number==ball.number && this.index != ball.index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return index == ball.index &&
                number == ball.number;
    }
}
