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
        boolean actual = baseballGame.strike(number, c, index);

        //then
        assertThat(actual).isTrue();
    }

    @Test
    void ball() {
        //given
        //failure case
        char c = '1';
        String number = "416";

        //when
        boolean actual = baseballGame.ball(number, c);

        //then
        assertThat(actual).isTrue();
    }

    @Test
    void complete() {
        //given
        Baseball baseball = new Baseball("123", "123");

        //2 strike
        baseball.strike();
        baseball.strike();
        baseball.strike();

        //then
        boolean actual = baseballGame.complete(baseball);

        //when
        assertThat(actual).isTrue();

    }
}
