package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void play() {
        // given
        List<Integer> userBalls = Arrays.asList(1, 2, 3);

        // when
        PlayResult result = balls.play(userBalls);

        // then
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.isGameEnd()).isTrue();
    }

    @Test
    void strike() {
        // when
        BallStatus status = balls.play(new Ball(1, 1));

        // then
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        // when
        BallStatus status = balls.play(new Ball(1, 2));

        // then
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        // when
        BallStatus status = balls.play(new Ball(1,4));

        // then
        assertThat(status).isEqualTo(BallStatus.NOTHING);

    }
}
