package baseball;

public class Ball {

    private int index;
    private int number;

    public Ball(int index, int number) {
        this.index = index;
        this.number = number;
    }

    public BallStatus play(Ball userBall) {
        if(userBall.isBall(this)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean isBall(Ball ball) {
        return this.number==ball.number && this.index != ball.index;
    }

}
