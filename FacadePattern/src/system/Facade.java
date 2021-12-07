package system;

public class Facade {

    private HelperSystem01 helperSystem01;
    private HelperSystem02 helperSystem02;
    private HelperSystem03 helperSystem03;

    public Facade() {
        helperSystem01 = new HelperSystem01();
        helperSystem02 = new HelperSystem02();
        helperSystem03 = new HelperSystem03();
    }

    public void process() {
        helperSystem01.process();
        helperSystem02.process();
        helperSystem03.process();
    }

}
