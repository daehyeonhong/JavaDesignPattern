package mediator.contract;

public class ChatColleague extends Colleague {

    @Override
    public void handle(String data) {
        System.out.printf("%s - %s\n", this, data);
    }

}
