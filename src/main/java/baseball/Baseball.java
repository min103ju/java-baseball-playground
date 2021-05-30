package baseball;

public class Baseball {

    private String input;
    private String number;

    private int strike;
    private int ball;

    public Baseball(String input, String number) {
        this.input = input;
        this.number = number;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void strike() {
        this.strike++;
    }

    public void ball() {
        this.ball++;
    }

    public int getStrike() {
        return strike;
    }
}
