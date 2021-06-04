package baseball;

import java.util.List;

public class Balls {
    private List<Ball> ballList;

    public Balls(List<Ball> ballList) {
        this.ballList = ballList;
    }

    public BallStatus play(Ball ball) {
        return BallStatus.NOTHING;
    }
}
