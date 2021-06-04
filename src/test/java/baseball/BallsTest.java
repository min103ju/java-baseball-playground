package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

/* Balls & Ball의 비교 */
public class BallsTest {

    Balls computerBalls;

    @BeforeEach
    void setUp() {
        computerBalls = new Balls(
                Arrays.asList(
                        new Ball(1,1),
                        new Ball(2,2),
                        new Ball(3,3))
        );
    }

    @Test
    void isComplete() {
        // given
        Balls userBalls = new Balls(
                Arrays.asList(
                        new Ball(1, 1),
                        new Ball(2, 2),
                        new Ball(3, 3))
        );

        // when
        computerBalls.plays(userBalls);
        boolean isComplete = userBalls.isComplete();

        // then
        assertThat(isComplete).isTrue();
    }

    @Test
    void ballsPlay() {
        // given
        Balls userBalls = new Balls(
                Arrays.asList(
                        new Ball(1, 1),
                        new Ball(2, 2),
                        new Ball(3, 5))
        );

        computerBalls.plays(userBalls);

        assertThat(userBalls.getBall()).isEqualTo(0);
        assertThat(userBalls.getStrike()).isEqualTo(2);

    }

    @Test
    void strikeOne() {
        // given
        Ball ball = new Ball(1, 1);

        // when
        computerBalls.play(ball);

        // then
        assertThat(computerBalls.getStrike()).isEqualTo(1);

    }

    @Test
    void ballOne() {
        // given
        Ball ball = new Ball(1, 2);

        // when
        computerBalls.play(ball);

        // then
        assertThat(computerBalls.getBall()).isEqualTo(1);

    }

    @Test
    void nothingOne() {
        // given
        Ball ball = new Ball(1, 6);

        // when
        computerBalls.play(ball);

        // then
        assertThat(computerBalls.getBall()).isEqualTo(0);
        assertThat(computerBalls.getStrike()).isEqualTo(0);

    }
}
