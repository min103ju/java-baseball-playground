package baseball;

public class Ball {

    private int index;
    private int number;

    public Ball(int index, int number) {
        this.index = index;
        this.number = number;
    }

    public BallStatus play(Ball userBall) {
        return BallStatus.NOTHING;
    }
}
