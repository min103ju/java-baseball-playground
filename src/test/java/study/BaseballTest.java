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
        int index = 0;
        String input = "123";
        String number = "156";
        Baseball baseball = new Baseball(input, number);

        //when
        baseballGame.strike(baseball, baseball.getInput().charAt(index), index);

        //then
        assertThat(baseball.getStrike()).isEqualTo(1);
    }

    @Test
    void ball() {
        //given
        int index = 0;
        String input = "213";
        String number = "426";
        Baseball baseball = new Baseball(input, number);

        //when
        baseballGame.ball(baseball, baseball.getInput().charAt(index), index);

        //then
        assertThat(baseball.getBall()).isEqualTo(1);
    }

    @Test
    void game() {
        //given
        //faliure case
        String input = "123";
        String number = "134";
        Baseball baseball = new Baseball(input, number);

        //when
        baseballGame.game(baseball);
    }

    @Test
    void complete() {
        //given
        Baseball baseball = new Baseball("123", "123");

        baseball.strike();
        baseball.strike();
        baseball.strike();

        //then
        baseballGame.isComplete(baseball);

        //when
//        assertThat(actual).isTrue();

    }
}
