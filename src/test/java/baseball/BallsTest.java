package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/* Balls & Ball의 비교 */
public class BallsTest {

    Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(
                Arrays.asList(
                        new Ball(1,1),
                        new Ball(2,2),
                        new Ball(3,3))
        );
    }

    @Test
    void ball() {
        // given
        Ball ball = new Ball(1, 2);

        // when
        BallStatus status = balls.play(ball);

        // then
        assertThat(status).isEqualTo(BallStatus.BALL);

    }

    @Test
    void nothing() {
        // given
        Ball ball = new Ball(1, 6);

        // when
        BallStatus status = balls.play(ball);

        // then
        assertThat(status).isEqualTo(BallStatus.NOTHING);

    }
}
