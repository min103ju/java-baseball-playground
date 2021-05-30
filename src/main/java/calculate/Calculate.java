package calculate;

import java.util.Scanner;

public class Calculate {

    public String[] scanner() {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        return inputValue.split(" ");
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

    public int division(int a, int b) {
        return a/b;
    }

    public int operation(String operation, int a, int b) {
        int result = 0;
        if(operation.equals("+")) result = addition(a,b);
        if(operation.equals("-")) result = subtraction(a,b);
        if(operation.equals("*")) result = multiplication(a,b);
        if(operation.equals("/")) result = division(a,b);
        return result;
    }
}
