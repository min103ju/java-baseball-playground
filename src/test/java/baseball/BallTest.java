package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    Ball computerBall;

    @BeforeEach
    void setUp() {
        computerBall = new Ball(1,2);
    }

    @Test
    void nothing() {
        assertThat(computerBall.play(new Ball(2,3)))
                .isEqualTo(BallStatus.NOTHING);
    }
}
