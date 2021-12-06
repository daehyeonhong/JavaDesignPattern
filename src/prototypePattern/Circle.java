package prototypePattern;

public class Circle extends Shape {

    private int x, y, r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();
        circle.x++;
        circle.y++;
        return circle;
    }

}
