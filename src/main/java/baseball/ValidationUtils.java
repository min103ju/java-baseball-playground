package baseball;

import java.util.List;

public class ValidationUtils {
    public static boolean validateNumber(int number) {
        return number > 0 && number < 10;
    }
}
