package chain;

public class PlusCalculator extends Calculator {

    @Override
    protected boolean operator(Request request) {
        if (request.getOperator().equals("+")) {
            int x = request.getX();
            int y = request.getY();
            int result = x + y;
            System.out.printf("%d + %d = %d\n", x, y, result);
        }
        return false;
    }

}
