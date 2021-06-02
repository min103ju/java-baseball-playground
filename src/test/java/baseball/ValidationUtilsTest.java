package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    void validateNumber() {
        assertThat(ValidationUtils.validateNumber(1)).isTrue();
        assertThat(ValidationUtils.validateNumber(9)).isTrue();
        assertThat(ValidationUtils.validateNumber(0)).isFalse();
        assertThat(ValidationUtils.validateNumber(10)).isFalse();
    }
}
