package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    Ball com;

    @BeforeEach
    void setUp() {
        // given
        com = new Ball(1, 2);
    }

    @Test
    void strike() {
        // when
        BallStatus status = com.play(new Ball(1, 2));

        // then
        assertThat(status).isEqualTo(BallStatus.STRIKE);

    }

    @Test
    void ball() {
        // when
        BallStatus status = com.play(new Ball(2, 2));

        // then
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        // when
        BallStatus status = com.play(new Ball(2,4));

        // then
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }
}
