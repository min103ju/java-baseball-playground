package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual1 = "1,2".split(",");
        assertThat(actual1).contains("1","2");

        String[] actual2 = "1,".split(",");
        assertThat(actual2).containsExactly("1");
    }

    @Test
    void substring() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt() method를 통해 특정 위치의 문자를 가져오고 위치를 벗어나면 Exception을 발생 시킨다.")
    void chatAt() {

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    int index = 4;
                    String actual = "abc";
                    actual.charAt(index);
                }).withMessageMatching("String index out of range: \\d");
    }
}
