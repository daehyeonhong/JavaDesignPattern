package proxy;

public interface Subject {

    // 리소스가 많이 드는 일
    void heavyAction();

    // 리소스가 적게 드는 일
    void lightAction();

}
