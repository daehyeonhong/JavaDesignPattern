package chain;

public abstract class Calculator {

    private Calculator nextCalculator;

    public void setNextCalculator(Calculator nextCalculator) {
        this.nextCalculator = nextCalculator;
    }

    public boolean process(Request request) {
        if (operator(request))
            return true;
        else {
            if (nextCalculator != null)
                return nextCalculator.process(request);
            return false;
        }
    }
//    private Calculator preCalculator;
//
//    public void setPreCalculator(Calculator preCalculator) {
//        this.preCalculator = preCalculator;
//    }
//
//    public boolean process(Request request) {
//        if (preCalculator != null && preCalculator.process(request))
//            return true;
//        return operator(request);
//    }

    protected abstract boolean operator(Request request);

}
