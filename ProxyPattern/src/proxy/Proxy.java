package proxy;

public class Proxy implements Subject {

    private Subject real;

    public Proxy(Subject real) {
        this.real = real;
    }

    @Override
    public void heavyAction() {
        real = new RealSubject();
        this.real.heavyAction();
    }

    @Override
    public void lightAction() {
        System.out.println("간단한 업무 by proxy");
    }

}
