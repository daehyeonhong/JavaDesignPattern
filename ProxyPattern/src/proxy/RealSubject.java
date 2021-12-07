package proxy;

public class RealSubject implements Subject {

    @Override
    public void heavyAction() {
        System.out.println("복잡한 업무 by real");
    }

    @Override
    public void lightAction() {
        System.out.println("간단한 업무 by real");
    }

}
