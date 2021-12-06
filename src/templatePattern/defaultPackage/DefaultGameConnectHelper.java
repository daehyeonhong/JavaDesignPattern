package templatePattern.defaultPackage;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {
    @Override
    protected String doSecurity(String string) {
//        System.out.println("디코드 작업");
        System.out.println("강화된 알고리즘을 이용한 디코드 작업");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권환 확인");
        // 서버에서 유저이름 유저의 나이를 알 수 있다.
        // 나이를 확인하고 지금 시간을 확인하고 미성년자이고 현재 시간이 22시 이후라면
        // 권한이 없는 것으로 한다.
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계");
        return info;
    }

}
