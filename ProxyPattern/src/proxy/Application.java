package proxy;

public class Application {

    public static void main(String[] args) {
        Subject real = new RealSubject();

        Subject proxy1 = new Proxy(real);
        Subject proxy2 = new Proxy(real);

        proxy1.heavyAction();
        proxy2.heavyAction();
        proxy1.lightAction();
        proxy2.lightAction();
    }

}
