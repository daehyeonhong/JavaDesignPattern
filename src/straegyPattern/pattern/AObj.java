package straegyPattern.pattern;

public class AObj {


    private AInterface aInterface;

    public AObj() {
        aInterface = new AInterfaceImpl();
    }

    public void funcAA() {

        // 위임
        aInterface.funcA();
        aInterface.funcA();
//        System.out.println("AAA");
//        System.out.println("AAA");

        // ~ 기능이 필요합니다. 개발해주세요!

    }

}
