package bridge;

public class MorseCode {

    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) {
        this.function = function;
    }

    void dot() {
        function.dot();
    }

    void dash() {
        function.dash();
    }

    void space() {
        function.space();
    }

}
