package bridge;

public class PrintMorseCode extends MorseCode {

    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }

    PrintMorseCode g() {
        dash();dash();dot();space();
        return this;
    }

    PrintMorseCode a() {
        dot();dash();space();
        return this;
    }

    PrintMorseCode r() {
        dot();dash();dot();space();
        return this;
    }

    PrintMorseCode m() {
        dash();dash();space();
        return this;
    }

}
