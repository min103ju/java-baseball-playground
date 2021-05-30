package calculate;

import java.util.Scanner;

public class Calculate {

    public char[] scanner() {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        return inputValue.toCharArray();
    }
}
