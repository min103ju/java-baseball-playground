package study;

import calculate.Calculate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    Calculate calculate = new Calculate();

    @Test
    //무시하는 게 뭐였지
    void scanner() {
        char[] charArray = calculate.scanner();
        assertThat(charArray.length).isEqualTo(7);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3","4,5,9"})
    void addition(int a, int b, int addition) {
        int actual = calculate.addition(a, b);
        assertThat(actual).isEqualTo(addition);
    }

    @ParameterizedTest
    @CsvSource(value = {"3,2,1", "7,4,3"})
    void subtraction(int a, int b, int subtraction) {
        int actual = calculate.subtraction(a, b);
        assertThat(actual).isEqualTo(subtraction);
    }

    @ParameterizedTest
    @CsvSource(value = {"2,3,6", "4,5,20"})
    void multiplication(int a, int b, int multiplication) {
        int actual = calculate.multiplication(a, b);
        assertThat(actual).isEqualTo(multiplication);
    }

    @ParameterizedTest
    @CsvSource(value = {"6,3,2", "8,2,4"})
    void division(int a, int b, int division) {
        int actual = calculate.division(a, b);
        assertThat(actual).isEqualTo(division);
    }
}
