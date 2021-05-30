package calculate;

import java.util.Scanner;

public class Calculate {

    public char[] scanner() {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        return inputValue.toCharArray();
    }

    public int addition(int a, int b) {
        return a+b;
    }

    public int subtraction(int a, int b) {
        return a-b;
    }

    public int multiplication(int a, int b) {
        return a*b;
    }
}
