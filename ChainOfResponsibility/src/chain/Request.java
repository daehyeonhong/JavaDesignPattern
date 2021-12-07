package chain;

public class Request {

    private int x, y;

    private String operator;

    public Request(int x, int y, String operator) {
        this.x = x;
        this.y = y;
        this.operator = operator;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

}
