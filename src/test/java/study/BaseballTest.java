package study;

import baseball.Baseball;
import baseball.BaseballGame;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballTest {

    BaseballGame baseballGame = new BaseballGame();

    @Test
    void strike() {
        //given
        char c = '1';
        int index = 0;
        String number = "156";

        //when
        boolean strike = baseballGame.strike(number, c, index);

        //then
        assertThat(strike).isTrue();
    }

    @Test
    void ball() {
        //given
        //failure case
        char c = '1';
        String number = "416";

        //when
        boolean ball = baseballGame.ball(number, c);

        //then
        assertThat(ball).isTrue();
    }
}
