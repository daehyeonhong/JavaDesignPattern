package syetem;

public class Application {

    public static void main(String[] args) {

        Button button = new Button();

        button.addObserver((o, arg) -> System.out.printf("%s is Clicked\n", o));

        button.onClick();
        button.onClick();
        button.onClick();

    }

}
