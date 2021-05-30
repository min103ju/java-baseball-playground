import calculate.Calculate;

public class Application {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        String[] scanner = calculate.scanner();

        int result = Integer.parseInt(scanner[0]);
        for (int i = 1; i < scanner.length; i+=2) {
            result = calculate.operation(scanner[i], result ,Integer.parseInt(scanner[i+1]));
        }

        System.out.println("result = " + result);
    }
}
